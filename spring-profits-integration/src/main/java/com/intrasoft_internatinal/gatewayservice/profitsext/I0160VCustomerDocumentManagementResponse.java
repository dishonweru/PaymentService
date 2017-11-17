
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
 *         &lt;element name="I0160V_CustomerDocumentManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0160VCustomerDocumentManagementExport" minOccurs="0"/>
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
    "i0160VCustomerDocumentManagementResult"
})
@XmlRootElement(name = "I0160V_CustomerDocumentManagementResponse")
public class I0160VCustomerDocumentManagementResponse {

    @XmlElement(name = "I0160V_CustomerDocumentManagementResult")
    protected I0160VCustomerDocumentManagementExport i0160VCustomerDocumentManagementResult;

    /**
     * Gets the value of the i0160VCustomerDocumentManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0160VCustomerDocumentManagementExport }
     *     
     */
    public I0160VCustomerDocumentManagementExport getI0160VCustomerDocumentManagementResult() {
        return i0160VCustomerDocumentManagementResult;
    }

    /**
     * Sets the value of the i0160VCustomerDocumentManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0160VCustomerDocumentManagementExport }
     *     
     */
    public void setI0160VCustomerDocumentManagementResult(I0160VCustomerDocumentManagementExport value) {
        this.i0160VCustomerDocumentManagementResult = value;
    }

}
