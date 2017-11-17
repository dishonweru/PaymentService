
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
 *         &lt;element name="CIA0009V_CustomerAccountMessagesResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0009V_CustomerAccountMessagesExport" minOccurs="0"/>
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
    "cia0009VCustomerAccountMessagesResult"
})
@XmlRootElement(name = "CIA0009V_CustomerAccountMessagesResponse")
public class CIA0009VCustomerAccountMessagesResponse {

    @XmlElement(name = "CIA0009V_CustomerAccountMessagesResult")
    protected CIA0009VCustomerAccountMessagesExport cia0009VCustomerAccountMessagesResult;

    /**
     * Gets the value of the cia0009VCustomerAccountMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CIA0009VCustomerAccountMessagesExport }
     *     
     */
    public CIA0009VCustomerAccountMessagesExport getCIA0009VCustomerAccountMessagesResult() {
        return cia0009VCustomerAccountMessagesResult;
    }

    /**
     * Sets the value of the cia0009VCustomerAccountMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIA0009VCustomerAccountMessagesExport }
     *     
     */
    public void setCIA0009VCustomerAccountMessagesResult(CIA0009VCustomerAccountMessagesExport value) {
        this.cia0009VCustomerAccountMessagesResult = value;
    }

}
