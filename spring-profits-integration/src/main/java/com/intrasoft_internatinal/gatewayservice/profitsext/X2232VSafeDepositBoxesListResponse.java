
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
 *         &lt;element name="X2232V_SafeDepositBoxesListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2232VSafeDepositBoxesListExport" minOccurs="0"/>
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
    "x2232VSafeDepositBoxesListResult"
})
@XmlRootElement(name = "X2232V_SafeDepositBoxesListResponse")
public class X2232VSafeDepositBoxesListResponse {

    @XmlElement(name = "X2232V_SafeDepositBoxesListResult")
    protected X2232VSafeDepositBoxesListExport x2232VSafeDepositBoxesListResult;

    /**
     * Gets the value of the x2232VSafeDepositBoxesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link X2232VSafeDepositBoxesListExport }
     *     
     */
    public X2232VSafeDepositBoxesListExport getX2232VSafeDepositBoxesListResult() {
        return x2232VSafeDepositBoxesListResult;
    }

    /**
     * Sets the value of the x2232VSafeDepositBoxesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link X2232VSafeDepositBoxesListExport }
     *     
     */
    public void setX2232VSafeDepositBoxesListResult(X2232VSafeDepositBoxesListExport value) {
        this.x2232VSafeDepositBoxesListResult = value;
    }

}
