
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
 *         &lt;element name="T2152VInsuranceCommitmentForecastResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2152VInsuranceCommitmentForecastExport" minOccurs="0"/>
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
    "t2152VInsuranceCommitmentForecastResult"
})
@XmlRootElement(name = "T2152VInsuranceCommitmentForecastResponse")
public class T2152VInsuranceCommitmentForecastResponse {

    @XmlElement(name = "T2152VInsuranceCommitmentForecastResult")
    protected T2152VInsuranceCommitmentForecastExport t2152VInsuranceCommitmentForecastResult;

    /**
     * Gets the value of the t2152VInsuranceCommitmentForecastResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2152VInsuranceCommitmentForecastExport }
     *     
     */
    public T2152VInsuranceCommitmentForecastExport getT2152VInsuranceCommitmentForecastResult() {
        return t2152VInsuranceCommitmentForecastResult;
    }

    /**
     * Sets the value of the t2152VInsuranceCommitmentForecastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2152VInsuranceCommitmentForecastExport }
     *     
     */
    public void setT2152VInsuranceCommitmentForecastResult(T2152VInsuranceCommitmentForecastExport value) {
        this.t2152VInsuranceCommitmentForecastResult = value;
    }

}
