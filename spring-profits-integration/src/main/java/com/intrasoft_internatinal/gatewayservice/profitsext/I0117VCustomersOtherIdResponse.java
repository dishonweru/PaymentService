
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
 *         &lt;element name="I0117V_CustomersOtherIdResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0117VCustomersOtherIdExport" minOccurs="0"/>
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
    "i0117VCustomersOtherIdResult"
})
@XmlRootElement(name = "I0117V_CustomersOtherIdResponse")
public class I0117VCustomersOtherIdResponse {

    @XmlElement(name = "I0117V_CustomersOtherIdResult")
    protected I0117VCustomersOtherIdExport i0117VCustomersOtherIdResult;

    /**
     * Gets the value of the i0117VCustomersOtherIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0117VCustomersOtherIdExport }
     *     
     */
    public I0117VCustomersOtherIdExport getI0117VCustomersOtherIdResult() {
        return i0117VCustomersOtherIdResult;
    }

    /**
     * Sets the value of the i0117VCustomersOtherIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0117VCustomersOtherIdExport }
     *     
     */
    public void setI0117VCustomersOtherIdResult(I0117VCustomersOtherIdExport value) {
        this.i0117VCustomersOtherIdResult = value;
    }

}
