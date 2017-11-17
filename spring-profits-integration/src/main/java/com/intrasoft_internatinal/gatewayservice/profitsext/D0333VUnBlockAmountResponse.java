
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
 *         &lt;element name="D0333V_UnBlockAmountResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0333VUnBlockAmountExport" minOccurs="0"/>
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
    "d0333VUnBlockAmountResult"
})
@XmlRootElement(name = "D0333V_UnBlockAmountResponse")
public class D0333VUnBlockAmountResponse {

    @XmlElement(name = "D0333V_UnBlockAmountResult")
    protected D0333VUnBlockAmountExport d0333VUnBlockAmountResult;

    /**
     * Gets the value of the d0333VUnBlockAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0333VUnBlockAmountExport }
     *     
     */
    public D0333VUnBlockAmountExport getD0333VUnBlockAmountResult() {
        return d0333VUnBlockAmountResult;
    }

    /**
     * Sets the value of the d0333VUnBlockAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0333VUnBlockAmountExport }
     *     
     */
    public void setD0333VUnBlockAmountResult(D0333VUnBlockAmountExport value) {
        this.d0333VUnBlockAmountResult = value;
    }

}
