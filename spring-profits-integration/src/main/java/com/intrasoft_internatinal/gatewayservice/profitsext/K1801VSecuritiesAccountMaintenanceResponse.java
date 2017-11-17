
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
 *         &lt;element name="K1801V_SecuritiesAccountMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SecuritiesAccountRetrieveExport" minOccurs="0"/>
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
    "k1801VSecuritiesAccountMaintenanceResult"
})
@XmlRootElement(name = "K1801V_SecuritiesAccountMaintenanceResponse")
public class K1801VSecuritiesAccountMaintenanceResponse {

    @XmlElement(name = "K1801V_SecuritiesAccountMaintenanceResult")
    protected SecuritiesAccountRetrieveExport k1801VSecuritiesAccountMaintenanceResult;

    /**
     * Gets the value of the k1801VSecuritiesAccountMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountRetrieveExport }
     *     
     */
    public SecuritiesAccountRetrieveExport getK1801VSecuritiesAccountMaintenanceResult() {
        return k1801VSecuritiesAccountMaintenanceResult;
    }

    /**
     * Sets the value of the k1801VSecuritiesAccountMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountRetrieveExport }
     *     
     */
    public void setK1801VSecuritiesAccountMaintenanceResult(SecuritiesAccountRetrieveExport value) {
        this.k1801VSecuritiesAccountMaintenanceResult = value;
    }

}
