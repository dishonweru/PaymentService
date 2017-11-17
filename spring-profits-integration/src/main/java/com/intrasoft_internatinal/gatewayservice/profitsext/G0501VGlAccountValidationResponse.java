
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
 *         &lt;element name="G0501V_GlAccountValidationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}G0501VGlAccountValidationExport" minOccurs="0"/>
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
    "g0501VGlAccountValidationResult"
})
@XmlRootElement(name = "G0501V_GlAccountValidationResponse")
public class G0501VGlAccountValidationResponse {

    @XmlElement(name = "G0501V_GlAccountValidationResult")
    protected G0501VGlAccountValidationExport g0501VGlAccountValidationResult;

    /**
     * Gets the value of the g0501VGlAccountValidationResult property.
     * 
     * @return
     *     possible object is
     *     {@link G0501VGlAccountValidationExport }
     *     
     */
    public G0501VGlAccountValidationExport getG0501VGlAccountValidationResult() {
        return g0501VGlAccountValidationResult;
    }

    /**
     * Sets the value of the g0501VGlAccountValidationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link G0501VGlAccountValidationExport }
     *     
     */
    public void setG0501VGlAccountValidationResult(G0501VGlAccountValidationExport value) {
        this.g0501VGlAccountValidationResult = value;
    }

}
