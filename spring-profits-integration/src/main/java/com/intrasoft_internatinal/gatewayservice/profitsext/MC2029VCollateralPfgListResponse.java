
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
 *         &lt;element name="MC2029V_CollateralPfgListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2029VCollateralPfgListExport" minOccurs="0"/>
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
    "mc2029VCollateralPfgListResult"
})
@XmlRootElement(name = "MC2029V_CollateralPfgListResponse")
public class MC2029VCollateralPfgListResponse {

    @XmlElement(name = "MC2029V_CollateralPfgListResult")
    protected MC2029VCollateralPfgListExport mc2029VCollateralPfgListResult;

    /**
     * Gets the value of the mc2029VCollateralPfgListResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2029VCollateralPfgListExport }
     *     
     */
    public MC2029VCollateralPfgListExport getMC2029VCollateralPfgListResult() {
        return mc2029VCollateralPfgListResult;
    }

    /**
     * Sets the value of the mc2029VCollateralPfgListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2029VCollateralPfgListExport }
     *     
     */
    public void setMC2029VCollateralPfgListResult(MC2029VCollateralPfgListExport value) {
        this.mc2029VCollateralPfgListResult = value;
    }

}
