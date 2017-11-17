
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
 *         &lt;element name="D0388V_ReconciliationWithExternalSystemsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ReconciliationWithExternalSystemsExport" minOccurs="0"/>
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
    "d0388VReconciliationWithExternalSystemsResult"
})
@XmlRootElement(name = "D0388V_ReconciliationWithExternalSystemsResponse")
public class D0388VReconciliationWithExternalSystemsResponse {

    @XmlElement(name = "D0388V_ReconciliationWithExternalSystemsResult")
    protected ReconciliationWithExternalSystemsExport d0388VReconciliationWithExternalSystemsResult;

    /**
     * Gets the value of the d0388VReconciliationWithExternalSystemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationWithExternalSystemsExport }
     *     
     */
    public ReconciliationWithExternalSystemsExport getD0388VReconciliationWithExternalSystemsResult() {
        return d0388VReconciliationWithExternalSystemsResult;
    }

    /**
     * Sets the value of the d0388VReconciliationWithExternalSystemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationWithExternalSystemsExport }
     *     
     */
    public void setD0388VReconciliationWithExternalSystemsResult(ReconciliationWithExternalSystemsExport value) {
        this.d0388VReconciliationWithExternalSystemsResult = value;
    }

}
