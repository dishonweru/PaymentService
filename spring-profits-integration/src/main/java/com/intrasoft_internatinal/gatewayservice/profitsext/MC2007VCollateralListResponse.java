
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
 *         &lt;element name="MC2007V_CollateralListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2007VCollateralListExport" minOccurs="0"/>
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
    "mc2007VCollateralListResult"
})
@XmlRootElement(name = "MC2007V_CollateralListResponse")
public class MC2007VCollateralListResponse {

    @XmlElement(name = "MC2007V_CollateralListResult")
    protected MC2007VCollateralListExport mc2007VCollateralListResult;

    /**
     * Gets the value of the mc2007VCollateralListResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2007VCollateralListExport }
     *     
     */
    public MC2007VCollateralListExport getMC2007VCollateralListResult() {
        return mc2007VCollateralListResult;
    }

    /**
     * Sets the value of the mc2007VCollateralListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2007VCollateralListExport }
     *     
     */
    public void setMC2007VCollateralListResult(MC2007VCollateralListExport value) {
        this.mc2007VCollateralListResult = value;
    }

}
