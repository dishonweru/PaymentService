
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
 *         &lt;element name="CMS3605V_CustomerCardStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3605VCustomerCardStatementExport" minOccurs="0"/>
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
    "cms3605VCustomerCardStatementResult"
})
@XmlRootElement(name = "CMS3605V_CustomerCardStatementResponse")
public class CMS3605VCustomerCardStatementResponse {

    @XmlElement(name = "CMS3605V_CustomerCardStatementResult")
    protected CMS3605VCustomerCardStatementExport cms3605VCustomerCardStatementResult;

    /**
     * Gets the value of the cms3605VCustomerCardStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link CMS3605VCustomerCardStatementExport }
     *     
     */
    public CMS3605VCustomerCardStatementExport getCMS3605VCustomerCardStatementResult() {
        return cms3605VCustomerCardStatementResult;
    }

    /**
     * Sets the value of the cms3605VCustomerCardStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMS3605VCustomerCardStatementExport }
     *     
     */
    public void setCMS3605VCustomerCardStatementResult(CMS3605VCustomerCardStatementExport value) {
        this.cms3605VCustomerCardStatementResult = value;
    }

}
