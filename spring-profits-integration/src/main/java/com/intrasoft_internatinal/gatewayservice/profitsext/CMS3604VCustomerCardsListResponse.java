
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
 *         &lt;element name="CMS3604V_CustomerCardsListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3604VCustomerCardsListExport" minOccurs="0"/>
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
    "cms3604VCustomerCardsListResult"
})
@XmlRootElement(name = "CMS3604V_CustomerCardsListResponse")
public class CMS3604VCustomerCardsListResponse {

    @XmlElement(name = "CMS3604V_CustomerCardsListResult")
    protected CMS3604VCustomerCardsListExport cms3604VCustomerCardsListResult;

    /**
     * Gets the value of the cms3604VCustomerCardsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CMS3604VCustomerCardsListExport }
     *     
     */
    public CMS3604VCustomerCardsListExport getCMS3604VCustomerCardsListResult() {
        return cms3604VCustomerCardsListResult;
    }

    /**
     * Sets the value of the cms3604VCustomerCardsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMS3604VCustomerCardsListExport }
     *     
     */
    public void setCMS3604VCustomerCardsListResult(CMS3604VCustomerCardsListExport value) {
        this.cms3604VCustomerCardsListResult = value;
    }

}
