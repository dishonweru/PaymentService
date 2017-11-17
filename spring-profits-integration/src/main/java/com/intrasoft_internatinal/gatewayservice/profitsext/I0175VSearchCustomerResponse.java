
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
 *         &lt;element name="I0175V_SearchCustomerResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SearchCustomerExport" minOccurs="0"/>
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
    "i0175VSearchCustomerResult"
})
@XmlRootElement(name = "I0175V_SearchCustomerResponse")
public class I0175VSearchCustomerResponse {

    @XmlElement(name = "I0175V_SearchCustomerResult")
    protected SearchCustomerExport i0175VSearchCustomerResult;

    /**
     * Gets the value of the i0175VSearchCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomerExport }
     *     
     */
    public SearchCustomerExport getI0175VSearchCustomerResult() {
        return i0175VSearchCustomerResult;
    }

    /**
     * Sets the value of the i0175VSearchCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomerExport }
     *     
     */
    public void setI0175VSearchCustomerResult(SearchCustomerExport value) {
        this.i0175VSearchCustomerResult = value;
    }

}
