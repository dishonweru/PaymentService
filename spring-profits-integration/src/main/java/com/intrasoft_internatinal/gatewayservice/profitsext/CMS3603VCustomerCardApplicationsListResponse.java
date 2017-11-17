
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
 *         &lt;element name="CMS3603V_CustomerCardApplicationsListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3603VCustomerCardApplicationsListExport" minOccurs="0"/>
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
    "cms3603VCustomerCardApplicationsListResult"
})
@XmlRootElement(name = "CMS3603V_CustomerCardApplicationsListResponse")
public class CMS3603VCustomerCardApplicationsListResponse {

    @XmlElement(name = "CMS3603V_CustomerCardApplicationsListResult")
    protected CMS3603VCustomerCardApplicationsListExport cms3603VCustomerCardApplicationsListResult;

    /**
     * Gets the value of the cms3603VCustomerCardApplicationsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CMS3603VCustomerCardApplicationsListExport }
     *     
     */
    public CMS3603VCustomerCardApplicationsListExport getCMS3603VCustomerCardApplicationsListResult() {
        return cms3603VCustomerCardApplicationsListResult;
    }

    /**
     * Sets the value of the cms3603VCustomerCardApplicationsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMS3603VCustomerCardApplicationsListExport }
     *     
     */
    public void setCMS3603VCustomerCardApplicationsListResult(CMS3603VCustomerCardApplicationsListExport value) {
        this.cms3603VCustomerCardApplicationsListResult = value;
    }

}
