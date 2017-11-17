
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
 *         &lt;element name="CMS3603V_CustomerCardApplicationsList_V2Result" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3603V_CustomerCardApplicationsList_V2Export" minOccurs="0"/>
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
    "cms3603VCustomerCardApplicationsListV2Result"
})
@XmlRootElement(name = "CMS3603V_CustomerCardApplicationsList_V2Response")
public class CMS3603VCustomerCardApplicationsListV2Response {

    @XmlElement(name = "CMS3603V_CustomerCardApplicationsList_V2Result")
    protected CMS3603VCustomerCardApplicationsListV2Export cms3603VCustomerCardApplicationsListV2Result;

    /**
     * Gets the value of the cms3603VCustomerCardApplicationsListV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link CMS3603VCustomerCardApplicationsListV2Export }
     *     
     */
    public CMS3603VCustomerCardApplicationsListV2Export getCMS3603VCustomerCardApplicationsListV2Result() {
        return cms3603VCustomerCardApplicationsListV2Result;
    }

    /**
     * Sets the value of the cms3603VCustomerCardApplicationsListV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMS3603VCustomerCardApplicationsListV2Export }
     *     
     */
    public void setCMS3603VCustomerCardApplicationsListV2Result(CMS3603VCustomerCardApplicationsListV2Export value) {
        this.cms3603VCustomerCardApplicationsListV2Result = value;
    }

}
