
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
 *         &lt;element name="CI3496V_GetUserInfoResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496V_GetUserInfoExport" minOccurs="0"/>
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
    "ci3496VGetUserInfoResult"
})
@XmlRootElement(name = "CI3496V_GetUserInfoResponse")
public class CI3496VGetUserInfoResponse {

    @XmlElement(name = "CI3496V_GetUserInfoResult")
    protected CI3496VGetUserInfoExport ci3496VGetUserInfoResult;

    /**
     * Gets the value of the ci3496VGetUserInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI3496VGetUserInfoExport }
     *     
     */
    public CI3496VGetUserInfoExport getCI3496VGetUserInfoResult() {
        return ci3496VGetUserInfoResult;
    }

    /**
     * Sets the value of the ci3496VGetUserInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI3496VGetUserInfoExport }
     *     
     */
    public void setCI3496VGetUserInfoResult(CI3496VGetUserInfoExport value) {
        this.ci3496VGetUserInfoResult = value;
    }

}
