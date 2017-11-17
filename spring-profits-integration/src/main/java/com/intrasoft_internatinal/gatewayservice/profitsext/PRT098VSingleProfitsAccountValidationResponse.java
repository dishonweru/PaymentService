
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
 *         &lt;element name="PRT098V_SingleProfitsAccountValidationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PRT098V_SingleProfitsAccountValidationExport" minOccurs="0"/>
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
    "prt098VSingleProfitsAccountValidationResult"
})
@XmlRootElement(name = "PRT098V_SingleProfitsAccountValidationResponse")
public class PRT098VSingleProfitsAccountValidationResponse {

    @XmlElement(name = "PRT098V_SingleProfitsAccountValidationResult")
    protected PRT098VSingleProfitsAccountValidationExport prt098VSingleProfitsAccountValidationResult;

    /**
     * Gets the value of the prt098VSingleProfitsAccountValidationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PRT098VSingleProfitsAccountValidationExport }
     *     
     */
    public PRT098VSingleProfitsAccountValidationExport getPRT098VSingleProfitsAccountValidationResult() {
        return prt098VSingleProfitsAccountValidationResult;
    }

    /**
     * Sets the value of the prt098VSingleProfitsAccountValidationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRT098VSingleProfitsAccountValidationExport }
     *     
     */
    public void setPRT098VSingleProfitsAccountValidationResult(PRT098VSingleProfitsAccountValidationExport value) {
        this.prt098VSingleProfitsAccountValidationResult = value;
    }

}
