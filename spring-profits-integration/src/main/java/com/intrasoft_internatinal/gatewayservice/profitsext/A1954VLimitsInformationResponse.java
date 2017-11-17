
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
 *         &lt;element name="A1954V_LimitsInformationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1954VLimitsInformationExport" minOccurs="0"/>
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
    "a1954VLimitsInformationResult"
})
@XmlRootElement(name = "A1954V_LimitsInformationResponse")
public class A1954VLimitsInformationResponse {

    @XmlElement(name = "A1954V_LimitsInformationResult")
    protected A1954VLimitsInformationExport a1954VLimitsInformationResult;

    /**
     * Gets the value of the a1954VLimitsInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link A1954VLimitsInformationExport }
     *     
     */
    public A1954VLimitsInformationExport getA1954VLimitsInformationResult() {
        return a1954VLimitsInformationResult;
    }

    /**
     * Sets the value of the a1954VLimitsInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link A1954VLimitsInformationExport }
     *     
     */
    public void setA1954VLimitsInformationResult(A1954VLimitsInformationExport value) {
        this.a1954VLimitsInformationResult = value;
    }

}
