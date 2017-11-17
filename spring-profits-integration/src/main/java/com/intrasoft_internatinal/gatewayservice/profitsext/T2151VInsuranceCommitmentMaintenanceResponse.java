
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
 *         &lt;element name="T2151VInsuranceCommitmentMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2151VInsuranceCommitmentMaintenanceExport" minOccurs="0"/>
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
    "t2151VInsuranceCommitmentMaintenanceResult"
})
@XmlRootElement(name = "T2151VInsuranceCommitmentMaintenanceResponse")
public class T2151VInsuranceCommitmentMaintenanceResponse {

    @XmlElement(name = "T2151VInsuranceCommitmentMaintenanceResult")
    protected T2151VInsuranceCommitmentMaintenanceExport t2151VInsuranceCommitmentMaintenanceResult;

    /**
     * Gets the value of the t2151VInsuranceCommitmentMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2151VInsuranceCommitmentMaintenanceExport }
     *     
     */
    public T2151VInsuranceCommitmentMaintenanceExport getT2151VInsuranceCommitmentMaintenanceResult() {
        return t2151VInsuranceCommitmentMaintenanceResult;
    }

    /**
     * Sets the value of the t2151VInsuranceCommitmentMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2151VInsuranceCommitmentMaintenanceExport }
     *     
     */
    public void setT2151VInsuranceCommitmentMaintenanceResult(T2151VInsuranceCommitmentMaintenanceExport value) {
        this.t2151VInsuranceCommitmentMaintenanceResult = value;
    }

}
