
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
 *         &lt;element name="T2102V_StandingOrdersManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2102V_StandingOrderTransferExport" minOccurs="0"/>
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
    "t2102VStandingOrdersManagementResult"
})
@XmlRootElement(name = "T2102V_StandingOrdersManagementResponse")
public class T2102VStandingOrdersManagementResponse {

    @XmlElement(name = "T2102V_StandingOrdersManagementResult")
    protected T2102VStandingOrderTransferExport t2102VStandingOrdersManagementResult;

    /**
     * Gets the value of the t2102VStandingOrdersManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2102VStandingOrderTransferExport }
     *     
     */
    public T2102VStandingOrderTransferExport getT2102VStandingOrdersManagementResult() {
        return t2102VStandingOrdersManagementResult;
    }

    /**
     * Sets the value of the t2102VStandingOrdersManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2102VStandingOrderTransferExport }
     *     
     */
    public void setT2102VStandingOrdersManagementResult(T2102VStandingOrderTransferExport value) {
        this.t2102VStandingOrdersManagementResult = value;
    }

}
