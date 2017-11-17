
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
 *         &lt;element name="MC2024V_CollateralListPerCollateralTypeResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2024VCollateralListPerCollateralTypeExport" minOccurs="0"/>
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
    "mc2024VCollateralListPerCollateralTypeResult"
})
@XmlRootElement(name = "MC2024V_CollateralListPerCollateralTypeResponse")
public class MC2024VCollateralListPerCollateralTypeResponse {

    @XmlElement(name = "MC2024V_CollateralListPerCollateralTypeResult")
    protected MC2024VCollateralListPerCollateralTypeExport mc2024VCollateralListPerCollateralTypeResult;

    /**
     * Gets the value of the mc2024VCollateralListPerCollateralTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2024VCollateralListPerCollateralTypeExport }
     *     
     */
    public MC2024VCollateralListPerCollateralTypeExport getMC2024VCollateralListPerCollateralTypeResult() {
        return mc2024VCollateralListPerCollateralTypeResult;
    }

    /**
     * Sets the value of the mc2024VCollateralListPerCollateralTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2024VCollateralListPerCollateralTypeExport }
     *     
     */
    public void setMC2024VCollateralListPerCollateralTypeResult(MC2024VCollateralListPerCollateralTypeExport value) {
        this.mc2024VCollateralListPerCollateralTypeResult = value;
    }

}
