
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
 *         &lt;element name="I0133V_CustomersOtherAfmResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0133VCustomersOtherAfmExport" minOccurs="0"/>
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
    "i0133VCustomersOtherAfmResult"
})
@XmlRootElement(name = "I0133V_CustomersOtherAfmResponse")
public class I0133VCustomersOtherAfmResponse {

    @XmlElement(name = "I0133V_CustomersOtherAfmResult")
    protected I0133VCustomersOtherAfmExport i0133VCustomersOtherAfmResult;

    /**
     * Gets the value of the i0133VCustomersOtherAfmResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0133VCustomersOtherAfmExport }
     *     
     */
    public I0133VCustomersOtherAfmExport getI0133VCustomersOtherAfmResult() {
        return i0133VCustomersOtherAfmResult;
    }

    /**
     * Sets the value of the i0133VCustomersOtherAfmResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0133VCustomersOtherAfmExport }
     *     
     */
    public void setI0133VCustomersOtherAfmResult(I0133VCustomersOtherAfmExport value) {
        this.i0133VCustomersOtherAfmResult = value;
    }

}
