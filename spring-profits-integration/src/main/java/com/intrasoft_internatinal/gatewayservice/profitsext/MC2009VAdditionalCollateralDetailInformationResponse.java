
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
 *         &lt;element name="MC2009V_AdditionalCollateralDetailInformationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2009VAdditionalCollateralDetailInformationExport" minOccurs="0"/>
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
    "mc2009VAdditionalCollateralDetailInformationResult"
})
@XmlRootElement(name = "MC2009V_AdditionalCollateralDetailInformationResponse")
public class MC2009VAdditionalCollateralDetailInformationResponse {

    @XmlElement(name = "MC2009V_AdditionalCollateralDetailInformationResult")
    protected MC2009VAdditionalCollateralDetailInformationExport mc2009VAdditionalCollateralDetailInformationResult;

    /**
     * Gets the value of the mc2009VAdditionalCollateralDetailInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2009VAdditionalCollateralDetailInformationExport }
     *     
     */
    public MC2009VAdditionalCollateralDetailInformationExport getMC2009VAdditionalCollateralDetailInformationResult() {
        return mc2009VAdditionalCollateralDetailInformationResult;
    }

    /**
     * Sets the value of the mc2009VAdditionalCollateralDetailInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2009VAdditionalCollateralDetailInformationExport }
     *     
     */
    public void setMC2009VAdditionalCollateralDetailInformationResult(MC2009VAdditionalCollateralDetailInformationExport value) {
        this.mc2009VAdditionalCollateralDetailInformationResult = value;
    }

}
