
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
 *         &lt;element name="D0303V_DepositAccountUpdateResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0303VDepositAccountUpdateExport" minOccurs="0"/>
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
    "d0303VDepositAccountUpdateResult"
})
@XmlRootElement(name = "D0303V_DepositAccountUpdateResponse")
public class D0303VDepositAccountUpdateResponse {

    @XmlElement(name = "D0303V_DepositAccountUpdateResult")
    protected D0303VDepositAccountUpdateExport d0303VDepositAccountUpdateResult;

    /**
     * Gets the value of the d0303VDepositAccountUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0303VDepositAccountUpdateExport }
     *     
     */
    public D0303VDepositAccountUpdateExport getD0303VDepositAccountUpdateResult() {
        return d0303VDepositAccountUpdateResult;
    }

    /**
     * Sets the value of the d0303VDepositAccountUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0303VDepositAccountUpdateExport }
     *     
     */
    public void setD0303VDepositAccountUpdateResult(D0303VDepositAccountUpdateExport value) {
        this.d0303VDepositAccountUpdateResult = value;
    }

}
