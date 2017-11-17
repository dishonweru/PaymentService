
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
 *         &lt;element name="CIA0008V_ManageMessageForCustomerResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0008V_ManageMessageForCustomerExport" minOccurs="0"/>
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
    "cia0008VManageMessageForCustomerResult"
})
@XmlRootElement(name = "CIA0008V_ManageMessageForCustomerResponse")
public class CIA0008VManageMessageForCustomerResponse {

    @XmlElement(name = "CIA0008V_ManageMessageForCustomerResult")
    protected CIA0008VManageMessageForCustomerExport cia0008VManageMessageForCustomerResult;

    /**
     * Gets the value of the cia0008VManageMessageForCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link CIA0008VManageMessageForCustomerExport }
     *     
     */
    public CIA0008VManageMessageForCustomerExport getCIA0008VManageMessageForCustomerResult() {
        return cia0008VManageMessageForCustomerResult;
    }

    /**
     * Sets the value of the cia0008VManageMessageForCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIA0008VManageMessageForCustomerExport }
     *     
     */
    public void setCIA0008VManageMessageForCustomerResult(CIA0008VManageMessageForCustomerExport value) {
        this.cia0008VManageMessageForCustomerResult = value;
    }

}
