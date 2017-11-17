
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
 *         &lt;element name="ThirdPartyResponseResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ThirdPartyResponseExport" minOccurs="0"/>
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
    "thirdPartyResponseResult"
})
@XmlRootElement(name = "ThirdPartyResponseResponse")
public class ThirdPartyResponseResponse {

    @XmlElement(name = "ThirdPartyResponseResult")
    protected ThirdPartyResponseExport thirdPartyResponseResult;

    /**
     * Gets the value of the thirdPartyResponseResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyResponseExport }
     *     
     */
    public ThirdPartyResponseExport getThirdPartyResponseResult() {
        return thirdPartyResponseResult;
    }

    /**
     * Sets the value of the thirdPartyResponseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyResponseExport }
     *     
     */
    public void setThirdPartyResponseResult(ThirdPartyResponseExport value) {
        this.thirdPartyResponseResult = value;
    }

}
