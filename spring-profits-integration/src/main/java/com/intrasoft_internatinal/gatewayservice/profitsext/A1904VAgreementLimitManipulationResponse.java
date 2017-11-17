
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
 *         &lt;element name="A1904V_AgreementLimitManipulationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1904VAgreementLimitManipulationExport" minOccurs="0"/>
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
    "a1904VAgreementLimitManipulationResult"
})
@XmlRootElement(name = "A1904V_AgreementLimitManipulationResponse")
public class A1904VAgreementLimitManipulationResponse {

    @XmlElement(name = "A1904V_AgreementLimitManipulationResult")
    protected A1904VAgreementLimitManipulationExport a1904VAgreementLimitManipulationResult;

    /**
     * Gets the value of the a1904VAgreementLimitManipulationResult property.
     * 
     * @return
     *     possible object is
     *     {@link A1904VAgreementLimitManipulationExport }
     *     
     */
    public A1904VAgreementLimitManipulationExport getA1904VAgreementLimitManipulationResult() {
        return a1904VAgreementLimitManipulationResult;
    }

    /**
     * Sets the value of the a1904VAgreementLimitManipulationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link A1904VAgreementLimitManipulationExport }
     *     
     */
    public void setA1904VAgreementLimitManipulationResult(A1904VAgreementLimitManipulationExport value) {
        this.a1904VAgreementLimitManipulationResult = value;
    }

}
