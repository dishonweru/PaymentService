
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
 *         &lt;element name="X2231V_CustomerSafeDepositBoxRentalsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2231V_CustomerSafeDepositBoxRentalsExport" minOccurs="0"/>
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
    "x2231VCustomerSafeDepositBoxRentalsResult"
})
@XmlRootElement(name = "X2231V_CustomerSafeDepositBoxRentalsResponse")
public class X2231VCustomerSafeDepositBoxRentalsResponse {

    @XmlElement(name = "X2231V_CustomerSafeDepositBoxRentalsResult")
    protected X2231VCustomerSafeDepositBoxRentalsExport x2231VCustomerSafeDepositBoxRentalsResult;

    /**
     * Gets the value of the x2231VCustomerSafeDepositBoxRentalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link X2231VCustomerSafeDepositBoxRentalsExport }
     *     
     */
    public X2231VCustomerSafeDepositBoxRentalsExport getX2231VCustomerSafeDepositBoxRentalsResult() {
        return x2231VCustomerSafeDepositBoxRentalsResult;
    }

    /**
     * Sets the value of the x2231VCustomerSafeDepositBoxRentalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link X2231VCustomerSafeDepositBoxRentalsExport }
     *     
     */
    public void setX2231VCustomerSafeDepositBoxRentalsResult(X2231VCustomerSafeDepositBoxRentalsExport value) {
        this.x2231VCustomerSafeDepositBoxRentalsResult = value;
    }

}
