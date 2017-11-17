
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
 *         &lt;element name="L0705V_LoginUserResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0705V_LoginUserExport" minOccurs="0"/>
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
    "l0705VLoginUserResult"
})
@XmlRootElement(name = "L0705V_LoginUserResponse")
public class L0705VLoginUserResponse {

    @XmlElement(name = "L0705V_LoginUserResult")
    protected L0705VLoginUserExport l0705VLoginUserResult;

    /**
     * Gets the value of the l0705VLoginUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0705VLoginUserExport }
     *     
     */
    public L0705VLoginUserExport getL0705VLoginUserResult() {
        return l0705VLoginUserResult;
    }

    /**
     * Sets the value of the l0705VLoginUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0705VLoginUserExport }
     *     
     */
    public void setL0705VLoginUserResult(L0705VLoginUserExport value) {
        this.l0705VLoginUserResult = value;
    }

}
