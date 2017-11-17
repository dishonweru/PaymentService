
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
 *         &lt;element name="CI4000V_GetUnitsListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI4000V_GetUnitsListExport" minOccurs="0"/>
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
    "ci4000VGetUnitsListResult"
})
@XmlRootElement(name = "CI4000V_GetUnitsListResponse")
public class CI4000VGetUnitsListResponse {

    @XmlElement(name = "CI4000V_GetUnitsListResult")
    protected CI4000VGetUnitsListExport ci4000VGetUnitsListResult;

    /**
     * Gets the value of the ci4000VGetUnitsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI4000VGetUnitsListExport }
     *     
     */
    public CI4000VGetUnitsListExport getCI4000VGetUnitsListResult() {
        return ci4000VGetUnitsListResult;
    }

    /**
     * Sets the value of the ci4000VGetUnitsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI4000VGetUnitsListExport }
     *     
     */
    public void setCI4000VGetUnitsListResult(CI4000VGetUnitsListExport value) {
        this.ci4000VGetUnitsListResult = value;
    }

}
