
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
 *         &lt;element name="MC2001V_CollateralMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CollateralFinancialForAgreementAccountExport" minOccurs="0"/>
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
    "mc2001VCollateralMaintenanceResult"
})
@XmlRootElement(name = "MC2001V_CollateralMaintenanceResponse")
public class MC2001VCollateralMaintenanceResponse {

    @XmlElement(name = "MC2001V_CollateralMaintenanceResult")
    protected CollateralFinancialForAgreementAccountExport mc2001VCollateralMaintenanceResult;

    /**
     * Gets the value of the mc2001VCollateralMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralFinancialForAgreementAccountExport }
     *     
     */
    public CollateralFinancialForAgreementAccountExport getMC2001VCollateralMaintenanceResult() {
        return mc2001VCollateralMaintenanceResult;
    }

    /**
     * Sets the value of the mc2001VCollateralMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralFinancialForAgreementAccountExport }
     *     
     */
    public void setMC2001VCollateralMaintenanceResult(CollateralFinancialForAgreementAccountExport value) {
        this.mc2001VCollateralMaintenanceResult = value;
    }

}
