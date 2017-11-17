
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
 *         &lt;element name="L0723V_LogoutUserResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0723V_LogoutUserExport" minOccurs="0"/>
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
    "l0723VLogoutUserResult"
})
@XmlRootElement(name = "L0723V_LogoutUserResponse")
public class L0723VLogoutUserResponse {

    @XmlElement(name = "L0723V_LogoutUserResult")
    protected L0723VLogoutUserExport l0723VLogoutUserResult;

    /**
     * Gets the value of the l0723VLogoutUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0723VLogoutUserExport }
     *     
     */
    public L0723VLogoutUserExport getL0723VLogoutUserResult() {
        return l0723VLogoutUserResult;
    }

    /**
     * Sets the value of the l0723VLogoutUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0723VLogoutUserExport }
     *     
     */
    public void setL0723VLogoutUserResult(L0723VLogoutUserExport value) {
        this.l0723VLogoutUserResult = value;
    }

}
