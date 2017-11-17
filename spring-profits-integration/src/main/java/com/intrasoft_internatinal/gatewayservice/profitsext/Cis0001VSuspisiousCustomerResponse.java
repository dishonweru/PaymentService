
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
 *         &lt;element name="Cis0001V_SuspisiousCustomerResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Cis0001VSuspisiousCustomerExport" minOccurs="0"/>
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
    "cis0001VSuspisiousCustomerResult"
})
@XmlRootElement(name = "Cis0001V_SuspisiousCustomerResponse")
public class Cis0001VSuspisiousCustomerResponse {

    @XmlElement(name = "Cis0001V_SuspisiousCustomerResult")
    protected Cis0001VSuspisiousCustomerExport cis0001VSuspisiousCustomerResult;

    /**
     * Gets the value of the cis0001VSuspisiousCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cis0001VSuspisiousCustomerExport }
     *     
     */
    public Cis0001VSuspisiousCustomerExport getCis0001VSuspisiousCustomerResult() {
        return cis0001VSuspisiousCustomerResult;
    }

    /**
     * Sets the value of the cis0001VSuspisiousCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cis0001VSuspisiousCustomerExport }
     *     
     */
    public void setCis0001VSuspisiousCustomerResult(Cis0001VSuspisiousCustomerExport value) {
        this.cis0001VSuspisiousCustomerResult = value;
    }

}
