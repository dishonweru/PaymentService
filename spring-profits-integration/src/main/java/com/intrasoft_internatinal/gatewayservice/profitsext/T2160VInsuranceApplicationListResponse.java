
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
 *         &lt;element name="T2160V_InsuranceApplicationListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2160VInsuranceApplicationListExport" minOccurs="0"/>
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
    "t2160VInsuranceApplicationListResult"
})
@XmlRootElement(name = "T2160V_InsuranceApplicationListResponse")
public class T2160VInsuranceApplicationListResponse {

    @XmlElement(name = "T2160V_InsuranceApplicationListResult")
    protected T2160VInsuranceApplicationListExport t2160VInsuranceApplicationListResult;

    /**
     * Gets the value of the t2160VInsuranceApplicationListResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2160VInsuranceApplicationListExport }
     *     
     */
    public T2160VInsuranceApplicationListExport getT2160VInsuranceApplicationListResult() {
        return t2160VInsuranceApplicationListResult;
    }

    /**
     * Sets the value of the t2160VInsuranceApplicationListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2160VInsuranceApplicationListExport }
     *     
     */
    public void setT2160VInsuranceApplicationListResult(T2160VInsuranceApplicationListExport value) {
        this.t2160VInsuranceApplicationListResult = value;
    }

}
