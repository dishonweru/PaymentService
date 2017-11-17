
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
 *         &lt;element name="CI4050V_GetBankParamsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI4050V_GetBankParamsExport" minOccurs="0"/>
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
    "ci4050VGetBankParamsResult"
})
@XmlRootElement(name = "CI4050V_GetBankParamsResponse")
public class CI4050VGetBankParamsResponse {

    @XmlElement(name = "CI4050V_GetBankParamsResult")
    protected CI4050VGetBankParamsExport ci4050VGetBankParamsResult;

    /**
     * Gets the value of the ci4050VGetBankParamsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI4050VGetBankParamsExport }
     *     
     */
    public CI4050VGetBankParamsExport getCI4050VGetBankParamsResult() {
        return ci4050VGetBankParamsResult;
    }

    /**
     * Sets the value of the ci4050VGetBankParamsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI4050VGetBankParamsExport }
     *     
     */
    public void setCI4050VGetBankParamsResult(CI4050VGetBankParamsExport value) {
        this.ci4050VGetBankParamsResult = value;
    }

}
