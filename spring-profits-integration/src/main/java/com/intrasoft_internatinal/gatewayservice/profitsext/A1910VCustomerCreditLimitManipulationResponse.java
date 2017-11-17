
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
 *         &lt;element name="A1910V_CustomerCreditLimitManipulationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1910VCustomerCreditLimitManipulationExport" minOccurs="0"/>
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
    "a1910VCustomerCreditLimitManipulationResult"
})
@XmlRootElement(name = "A1910V_CustomerCreditLimitManipulationResponse")
public class A1910VCustomerCreditLimitManipulationResponse {

    @XmlElement(name = "A1910V_CustomerCreditLimitManipulationResult")
    protected A1910VCustomerCreditLimitManipulationExport a1910VCustomerCreditLimitManipulationResult;

    /**
     * Gets the value of the a1910VCustomerCreditLimitManipulationResult property.
     * 
     * @return
     *     possible object is
     *     {@link A1910VCustomerCreditLimitManipulationExport }
     *     
     */
    public A1910VCustomerCreditLimitManipulationExport getA1910VCustomerCreditLimitManipulationResult() {
        return a1910VCustomerCreditLimitManipulationResult;
    }

    /**
     * Sets the value of the a1910VCustomerCreditLimitManipulationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link A1910VCustomerCreditLimitManipulationExport }
     *     
     */
    public void setA1910VCustomerCreditLimitManipulationResult(A1910VCustomerCreditLimitManipulationExport value) {
        this.a1910VCustomerCreditLimitManipulationResult = value;
    }

}
