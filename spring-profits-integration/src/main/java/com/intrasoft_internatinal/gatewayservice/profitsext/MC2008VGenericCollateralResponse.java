
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
 *         &lt;element name="MC2008V_GenericCollateralResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2008VGenericCollateralExport" minOccurs="0"/>
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
    "mc2008VGenericCollateralResult"
})
@XmlRootElement(name = "MC2008V_GenericCollateralResponse")
public class MC2008VGenericCollateralResponse {

    @XmlElement(name = "MC2008V_GenericCollateralResult")
    protected MC2008VGenericCollateralExport mc2008VGenericCollateralResult;

    /**
     * Gets the value of the mc2008VGenericCollateralResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2008VGenericCollateralExport }
     *     
     */
    public MC2008VGenericCollateralExport getMC2008VGenericCollateralResult() {
        return mc2008VGenericCollateralResult;
    }

    /**
     * Sets the value of the mc2008VGenericCollateralResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2008VGenericCollateralExport }
     *     
     */
    public void setMC2008VGenericCollateralResult(MC2008VGenericCollateralExport value) {
        this.mc2008VGenericCollateralResult = value;
    }

}
