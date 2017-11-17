
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
 *         &lt;element name="D0321V_BlockAmountResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0321VBlockAmountExport" minOccurs="0"/>
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
    "d0321VBlockAmountResult"
})
@XmlRootElement(name = "D0321V_BlockAmountResponse")
public class D0321VBlockAmountResponse {

    @XmlElement(name = "D0321V_BlockAmountResult")
    protected D0321VBlockAmountExport d0321VBlockAmountResult;

    /**
     * Gets the value of the d0321VBlockAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0321VBlockAmountExport }
     *     
     */
    public D0321VBlockAmountExport getD0321VBlockAmountResult() {
        return d0321VBlockAmountResult;
    }

    /**
     * Sets the value of the d0321VBlockAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0321VBlockAmountExport }
     *     
     */
    public void setD0321VBlockAmountResult(D0321VBlockAmountExport value) {
        this.d0321VBlockAmountResult = value;
    }

}
