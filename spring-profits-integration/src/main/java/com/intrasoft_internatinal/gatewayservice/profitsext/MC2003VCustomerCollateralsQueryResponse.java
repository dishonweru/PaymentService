
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
 *         &lt;element name="MC2003V_CustomerCollateralsQueryResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2003VCustomerCollateralsQueryExport" minOccurs="0"/>
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
    "mc2003VCustomerCollateralsQueryResult"
})
@XmlRootElement(name = "MC2003V_CustomerCollateralsQueryResponse")
public class MC2003VCustomerCollateralsQueryResponse {

    @XmlElement(name = "MC2003V_CustomerCollateralsQueryResult")
    protected MC2003VCustomerCollateralsQueryExport mc2003VCustomerCollateralsQueryResult;

    /**
     * Gets the value of the mc2003VCustomerCollateralsQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2003VCustomerCollateralsQueryExport }
     *     
     */
    public MC2003VCustomerCollateralsQueryExport getMC2003VCustomerCollateralsQueryResult() {
        return mc2003VCustomerCollateralsQueryResult;
    }

    /**
     * Sets the value of the mc2003VCustomerCollateralsQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2003VCustomerCollateralsQueryExport }
     *     
     */
    public void setMC2003VCustomerCollateralsQueryResult(MC2003VCustomerCollateralsQueryExport value) {
        this.mc2003VCustomerCollateralsQueryResult = value;
    }

}
