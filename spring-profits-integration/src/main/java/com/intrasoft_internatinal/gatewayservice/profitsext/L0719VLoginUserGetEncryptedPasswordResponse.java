
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
 *         &lt;element name="L0719V_LoginUserGetEncryptedPasswordResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0719V_LoginUserGetEncryptedPasswordExport" minOccurs="0"/>
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
    "l0719VLoginUserGetEncryptedPasswordResult"
})
@XmlRootElement(name = "L0719V_LoginUserGetEncryptedPasswordResponse")
public class L0719VLoginUserGetEncryptedPasswordResponse {

    @XmlElement(name = "L0719V_LoginUserGetEncryptedPasswordResult")
    protected L0719VLoginUserGetEncryptedPasswordExport l0719VLoginUserGetEncryptedPasswordResult;

    /**
     * Gets the value of the l0719VLoginUserGetEncryptedPasswordResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0719VLoginUserGetEncryptedPasswordExport }
     *     
     */
    public L0719VLoginUserGetEncryptedPasswordExport getL0719VLoginUserGetEncryptedPasswordResult() {
        return l0719VLoginUserGetEncryptedPasswordResult;
    }

    /**
     * Sets the value of the l0719VLoginUserGetEncryptedPasswordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0719VLoginUserGetEncryptedPasswordExport }
     *     
     */
    public void setL0719VLoginUserGetEncryptedPasswordResult(L0719VLoginUserGetEncryptedPasswordExport value) {
        this.l0719VLoginUserGetEncryptedPasswordResult = value;
    }

}
