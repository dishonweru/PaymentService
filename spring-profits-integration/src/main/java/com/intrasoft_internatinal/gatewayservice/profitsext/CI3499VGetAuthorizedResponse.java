
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
 *         &lt;element name="CI3499V_GetAuthorizedResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}GetAuthorizedExport" minOccurs="0"/>
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
    "ci3499VGetAuthorizedResult"
})
@XmlRootElement(name = "CI3499V_GetAuthorizedResponse")
public class CI3499VGetAuthorizedResponse {

    @XmlElement(name = "CI3499V_GetAuthorizedResult")
    protected GetAuthorizedExport ci3499VGetAuthorizedResult;

    /**
     * Gets the value of the ci3499VGetAuthorizedResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAuthorizedExport }
     *     
     */
    public GetAuthorizedExport getCI3499VGetAuthorizedResult() {
        return ci3499VGetAuthorizedResult;
    }

    /**
     * Sets the value of the ci3499VGetAuthorizedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAuthorizedExport }
     *     
     */
    public void setCI3499VGetAuthorizedResult(GetAuthorizedExport value) {
        this.ci3499VGetAuthorizedResult = value;
    }

}
