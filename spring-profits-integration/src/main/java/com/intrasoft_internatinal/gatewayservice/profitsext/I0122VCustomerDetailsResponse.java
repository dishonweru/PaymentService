
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
 *         &lt;element name="I0122V_CustomerDetailsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0122V_CustomerDetailsExport" minOccurs="0"/>
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
    "i0122VCustomerDetailsResult"
})
@XmlRootElement(name = "I0122V_CustomerDetailsResponse")
public class I0122VCustomerDetailsResponse {

    @XmlElement(name = "I0122V_CustomerDetailsResult")
    protected I0122VCustomerDetailsExport i0122VCustomerDetailsResult;

    /**
     * Gets the value of the i0122VCustomerDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0122VCustomerDetailsExport }
     *     
     */
    public I0122VCustomerDetailsExport getI0122VCustomerDetailsResult() {
        return i0122VCustomerDetailsResult;
    }

    /**
     * Sets the value of the i0122VCustomerDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0122VCustomerDetailsExport }
     *     
     */
    public void setI0122VCustomerDetailsResult(I0122VCustomerDetailsExport value) {
        this.i0122VCustomerDetailsResult = value;
    }

}
