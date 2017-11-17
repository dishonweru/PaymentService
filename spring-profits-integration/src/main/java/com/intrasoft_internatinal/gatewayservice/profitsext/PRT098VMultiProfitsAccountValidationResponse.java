
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
 *         &lt;element name="PRT098V_MultiProfitsAccountValidationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PRT098V_MultiProfitsAccountValidationExport" minOccurs="0"/>
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
    "prt098VMultiProfitsAccountValidationResult"
})
@XmlRootElement(name = "PRT098V_MultiProfitsAccountValidationResponse")
public class PRT098VMultiProfitsAccountValidationResponse {

    @XmlElement(name = "PRT098V_MultiProfitsAccountValidationResult")
    protected PRT098VMultiProfitsAccountValidationExport prt098VMultiProfitsAccountValidationResult;

    /**
     * Gets the value of the prt098VMultiProfitsAccountValidationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PRT098VMultiProfitsAccountValidationExport }
     *     
     */
    public PRT098VMultiProfitsAccountValidationExport getPRT098VMultiProfitsAccountValidationResult() {
        return prt098VMultiProfitsAccountValidationResult;
    }

    /**
     * Sets the value of the prt098VMultiProfitsAccountValidationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRT098VMultiProfitsAccountValidationExport }
     *     
     */
    public void setPRT098VMultiProfitsAccountValidationResult(PRT098VMultiProfitsAccountValidationExport value) {
        this.prt098VMultiProfitsAccountValidationResult = value;
    }

}
