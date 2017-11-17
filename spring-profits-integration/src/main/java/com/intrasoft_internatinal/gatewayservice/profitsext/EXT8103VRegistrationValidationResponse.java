
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
 *         &lt;element name="EXT8103V_RegistrationValidationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}EXT8103V_RegistrationValidationExport" minOccurs="0"/>
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
    "ext8103VRegistrationValidationResult"
})
@XmlRootElement(name = "EXT8103V_RegistrationValidationResponse")
public class EXT8103VRegistrationValidationResponse {

    @XmlElement(name = "EXT8103V_RegistrationValidationResult")
    protected EXT8103VRegistrationValidationExport ext8103VRegistrationValidationResult;

    /**
     * Gets the value of the ext8103VRegistrationValidationResult property.
     * 
     * @return
     *     possible object is
     *     {@link EXT8103VRegistrationValidationExport }
     *     
     */
    public EXT8103VRegistrationValidationExport getEXT8103VRegistrationValidationResult() {
        return ext8103VRegistrationValidationResult;
    }

    /**
     * Sets the value of the ext8103VRegistrationValidationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXT8103VRegistrationValidationExport }
     *     
     */
    public void setEXT8103VRegistrationValidationResult(EXT8103VRegistrationValidationExport value) {
        this.ext8103VRegistrationValidationResult = value;
    }

}
