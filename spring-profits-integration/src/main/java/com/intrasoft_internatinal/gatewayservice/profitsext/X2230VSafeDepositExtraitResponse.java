
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
 *         &lt;element name="X2230V_SafeDepositExtraitResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2230VSafeDepositExtraitExport" minOccurs="0"/>
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
    "x2230VSafeDepositExtraitResult"
})
@XmlRootElement(name = "X2230V_SafeDepositExtraitResponse")
public class X2230VSafeDepositExtraitResponse {

    @XmlElement(name = "X2230V_SafeDepositExtraitResult")
    protected X2230VSafeDepositExtraitExport x2230VSafeDepositExtraitResult;

    /**
     * Gets the value of the x2230VSafeDepositExtraitResult property.
     * 
     * @return
     *     possible object is
     *     {@link X2230VSafeDepositExtraitExport }
     *     
     */
    public X2230VSafeDepositExtraitExport getX2230VSafeDepositExtraitResult() {
        return x2230VSafeDepositExtraitResult;
    }

    /**
     * Sets the value of the x2230VSafeDepositExtraitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link X2230VSafeDepositExtraitExport }
     *     
     */
    public void setX2230VSafeDepositExtraitResult(X2230VSafeDepositExtraitExport value) {
        this.x2230VSafeDepositExtraitResult = value;
    }

}
