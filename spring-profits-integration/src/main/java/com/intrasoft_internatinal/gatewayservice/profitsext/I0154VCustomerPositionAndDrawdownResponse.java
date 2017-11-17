
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
 *         &lt;element name="I0154V_CustomerPositionAndDrawdownResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CustomerPositionAndDrawdownExport" minOccurs="0"/>
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
    "i0154VCustomerPositionAndDrawdownResult"
})
@XmlRootElement(name = "I0154V_CustomerPositionAndDrawdownResponse")
public class I0154VCustomerPositionAndDrawdownResponse {

    @XmlElement(name = "I0154V_CustomerPositionAndDrawdownResult")
    protected CustomerPositionAndDrawdownExport i0154VCustomerPositionAndDrawdownResult;

    /**
     * Gets the value of the i0154VCustomerPositionAndDrawdownResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPositionAndDrawdownExport }
     *     
     */
    public CustomerPositionAndDrawdownExport getI0154VCustomerPositionAndDrawdownResult() {
        return i0154VCustomerPositionAndDrawdownResult;
    }

    /**
     * Sets the value of the i0154VCustomerPositionAndDrawdownResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPositionAndDrawdownExport }
     *     
     */
    public void setI0154VCustomerPositionAndDrawdownResult(CustomerPositionAndDrawdownExport value) {
        this.i0154VCustomerPositionAndDrawdownResult = value;
    }

}
