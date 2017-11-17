
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
 *         &lt;element name="CMS3601V_NewCardApplicationManagement_V2Result" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601V_NewCardApplicationManagement_V2Export" minOccurs="0"/>
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
    "cms3601VNewCardApplicationManagementV2Result"
})
@XmlRootElement(name = "CMS3601V_NewCardApplicationManagement_V2Response")
public class CMS3601VNewCardApplicationManagementV2Response {

    @XmlElement(name = "CMS3601V_NewCardApplicationManagement_V2Result")
    protected CMS3601VNewCardApplicationManagementV2Export cms3601VNewCardApplicationManagementV2Result;

    /**
     * Gets the value of the cms3601VNewCardApplicationManagementV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link CMS3601VNewCardApplicationManagementV2Export }
     *     
     */
    public CMS3601VNewCardApplicationManagementV2Export getCMS3601VNewCardApplicationManagementV2Result() {
        return cms3601VNewCardApplicationManagementV2Result;
    }

    /**
     * Sets the value of the cms3601VNewCardApplicationManagementV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMS3601VNewCardApplicationManagementV2Export }
     *     
     */
    public void setCMS3601VNewCardApplicationManagementV2Result(CMS3601VNewCardApplicationManagementV2Export value) {
        this.cms3601VNewCardApplicationManagementV2Result = value;
    }

}
