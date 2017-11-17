
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
 *         &lt;element name="I0130V_CustomerCategoriesListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0130VCustomerCategoriesListExport" minOccurs="0"/>
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
    "i0130VCustomerCategoriesListResult"
})
@XmlRootElement(name = "I0130V_CustomerCategoriesListResponse")
public class I0130VCustomerCategoriesListResponse {

    @XmlElement(name = "I0130V_CustomerCategoriesListResult")
    protected I0130VCustomerCategoriesListExport i0130VCustomerCategoriesListResult;

    /**
     * Gets the value of the i0130VCustomerCategoriesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0130VCustomerCategoriesListExport }
     *     
     */
    public I0130VCustomerCategoriesListExport getI0130VCustomerCategoriesListResult() {
        return i0130VCustomerCategoriesListResult;
    }

    /**
     * Sets the value of the i0130VCustomerCategoriesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0130VCustomerCategoriesListExport }
     *     
     */
    public void setI0130VCustomerCategoriesListResult(I0130VCustomerCategoriesListExport value) {
        this.i0130VCustomerCategoriesListResult = value;
    }

}
