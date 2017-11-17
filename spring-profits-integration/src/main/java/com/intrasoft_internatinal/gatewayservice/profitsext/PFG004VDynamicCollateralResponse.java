
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
 *         &lt;element name="PFG004V_DynamicCollateralResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VDynamicCollateralExport" minOccurs="0"/>
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
    "pfg004VDynamicCollateralResult"
})
@XmlRootElement(name = "PFG004V_DynamicCollateralResponse")
public class PFG004VDynamicCollateralResponse {

    @XmlElement(name = "PFG004V_DynamicCollateralResult")
    protected PFG004VDynamicCollateralExport pfg004VDynamicCollateralResult;

    /**
     * Gets the value of the pfg004VDynamicCollateralResult property.
     * 
     * @return
     *     possible object is
     *     {@link PFG004VDynamicCollateralExport }
     *     
     */
    public PFG004VDynamicCollateralExport getPFG004VDynamicCollateralResult() {
        return pfg004VDynamicCollateralResult;
    }

    /**
     * Sets the value of the pfg004VDynamicCollateralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFG004VDynamicCollateralExport }
     *     
     */
    public void setPFG004VDynamicCollateralResult(PFG004VDynamicCollateralExport value) {
        this.pfg004VDynamicCollateralResult = value;
    }

}
