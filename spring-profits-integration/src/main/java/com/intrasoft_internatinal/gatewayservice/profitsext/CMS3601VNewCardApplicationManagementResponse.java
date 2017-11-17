
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
 *         &lt;element name="CMS3601V_NewCardApplicationManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601VNewCardApplicationManagementExport" minOccurs="0"/>
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
    "cms3601VNewCardApplicationManagementResult"
})
@XmlRootElement(name = "CMS3601V_NewCardApplicationManagementResponse")
public class CMS3601VNewCardApplicationManagementResponse {

    @XmlElement(name = "CMS3601V_NewCardApplicationManagementResult")
    protected CMS3601VNewCardApplicationManagementExport cms3601VNewCardApplicationManagementResult;

    /**
     * Gets the value of the cms3601VNewCardApplicationManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link CMS3601VNewCardApplicationManagementExport }
     *     
     */
    public CMS3601VNewCardApplicationManagementExport getCMS3601VNewCardApplicationManagementResult() {
        return cms3601VNewCardApplicationManagementResult;
    }

    /**
     * Sets the value of the cms3601VNewCardApplicationManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMS3601VNewCardApplicationManagementExport }
     *     
     */
    public void setCMS3601VNewCardApplicationManagementResult(CMS3601VNewCardApplicationManagementExport value) {
        this.cms3601VNewCardApplicationManagementResult = value;
    }

}
