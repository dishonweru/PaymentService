
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
 *         &lt;element name="I0128V_CustomerRelationshipListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0128VCustomerRelationshipListExport" minOccurs="0"/>
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
    "i0128VCustomerRelationshipListResult"
})
@XmlRootElement(name = "I0128V_CustomerRelationshipListResponse")
public class I0128VCustomerRelationshipListResponse {

    @XmlElement(name = "I0128V_CustomerRelationshipListResult")
    protected I0128VCustomerRelationshipListExport i0128VCustomerRelationshipListResult;

    /**
     * Gets the value of the i0128VCustomerRelationshipListResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0128VCustomerRelationshipListExport }
     *     
     */
    public I0128VCustomerRelationshipListExport getI0128VCustomerRelationshipListResult() {
        return i0128VCustomerRelationshipListResult;
    }

    /**
     * Sets the value of the i0128VCustomerRelationshipListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0128VCustomerRelationshipListExport }
     *     
     */
    public void setI0128VCustomerRelationshipListResult(I0128VCustomerRelationshipListExport value) {
        this.i0128VCustomerRelationshipListResult = value;
    }

}
