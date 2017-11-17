
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
 *         &lt;element name="T1401V_LettersOfGuaranteeMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}LettersOfGuaranteeRetrieveExport" minOccurs="0"/>
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
    "t1401VLettersOfGuaranteeMaintenanceResult"
})
@XmlRootElement(name = "T1401V_LettersOfGuaranteeMaintenanceResponse")
public class T1401VLettersOfGuaranteeMaintenanceResponse {

    @XmlElement(name = "T1401V_LettersOfGuaranteeMaintenanceResult")
    protected LettersOfGuaranteeRetrieveExport t1401VLettersOfGuaranteeMaintenanceResult;

    /**
     * Gets the value of the t1401VLettersOfGuaranteeMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link LettersOfGuaranteeRetrieveExport }
     *     
     */
    public LettersOfGuaranteeRetrieveExport getT1401VLettersOfGuaranteeMaintenanceResult() {
        return t1401VLettersOfGuaranteeMaintenanceResult;
    }

    /**
     * Sets the value of the t1401VLettersOfGuaranteeMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersOfGuaranteeRetrieveExport }
     *     
     */
    public void setT1401VLettersOfGuaranteeMaintenanceResult(LettersOfGuaranteeRetrieveExport value) {
        this.t1401VLettersOfGuaranteeMaintenanceResult = value;
    }

}
