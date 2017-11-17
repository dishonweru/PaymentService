
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
 *         &lt;element name="T2190V_InsurancePolicyStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2190VInsurancePolicyStatementExport" minOccurs="0"/>
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
    "t2190VInsurancePolicyStatementResult"
})
@XmlRootElement(name = "T2190V_InsurancePolicyStatementResponse")
public class T2190VInsurancePolicyStatementResponse {

    @XmlElement(name = "T2190V_InsurancePolicyStatementResult")
    protected T2190VInsurancePolicyStatementExport t2190VInsurancePolicyStatementResult;

    /**
     * Gets the value of the t2190VInsurancePolicyStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2190VInsurancePolicyStatementExport }
     *     
     */
    public T2190VInsurancePolicyStatementExport getT2190VInsurancePolicyStatementResult() {
        return t2190VInsurancePolicyStatementResult;
    }

    /**
     * Sets the value of the t2190VInsurancePolicyStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2190VInsurancePolicyStatementExport }
     *     
     */
    public void setT2190VInsurancePolicyStatementResult(T2190VInsurancePolicyStatementExport value) {
        this.t2190VInsurancePolicyStatementResult = value;
    }

}
