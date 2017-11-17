
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
 *         &lt;element name="Prt099V_CustomerAccountsListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Prt099VCustomerAccountsListExport" minOccurs="0"/>
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
    "prt099VCustomerAccountsListResult"
})
@XmlRootElement(name = "Prt099V_CustomerAccountsListResponse")
public class Prt099VCustomerAccountsListResponse {

    @XmlElement(name = "Prt099V_CustomerAccountsListResult")
    protected Prt099VCustomerAccountsListExport prt099VCustomerAccountsListResult;

    /**
     * Gets the value of the prt099VCustomerAccountsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link Prt099VCustomerAccountsListExport }
     *     
     */
    public Prt099VCustomerAccountsListExport getPrt099VCustomerAccountsListResult() {
        return prt099VCustomerAccountsListResult;
    }

    /**
     * Sets the value of the prt099VCustomerAccountsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prt099VCustomerAccountsListExport }
     *     
     */
    public void setPrt099VCustomerAccountsListResult(Prt099VCustomerAccountsListExport value) {
        this.prt099VCustomerAccountsListResult = value;
    }

}
