
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
 *         &lt;element name="CI4100V_GetBanksListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI4100V_GetBanksListExport" minOccurs="0"/>
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
    "ci4100VGetBanksListResult"
})
@XmlRootElement(name = "CI4100V_GetBanksListResponse")
public class CI4100VGetBanksListResponse {

    @XmlElement(name = "CI4100V_GetBanksListResult")
    protected CI4100VGetBanksListExport ci4100VGetBanksListResult;

    /**
     * Gets the value of the ci4100VGetBanksListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI4100VGetBanksListExport }
     *     
     */
    public CI4100VGetBanksListExport getCI4100VGetBanksListResult() {
        return ci4100VGetBanksListResult;
    }

    /**
     * Sets the value of the ci4100VGetBanksListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI4100VGetBanksListExport }
     *     
     */
    public void setCI4100VGetBanksListResult(CI4100VGetBanksListExport value) {
        this.ci4100VGetBanksListResult = value;
    }

}
