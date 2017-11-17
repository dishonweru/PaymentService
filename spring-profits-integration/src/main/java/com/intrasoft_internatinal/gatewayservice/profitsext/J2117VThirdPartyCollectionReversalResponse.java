
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
 *         &lt;element name="J2117V_ThirdPartyCollectionReversalResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}J2117V_ThirdPartyCollectionReversalExport" minOccurs="0"/>
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
    "j2117VThirdPartyCollectionReversalResult"
})
@XmlRootElement(name = "J2117V_ThirdPartyCollectionReversalResponse")
public class J2117VThirdPartyCollectionReversalResponse {

    @XmlElement(name = "J2117V_ThirdPartyCollectionReversalResult")
    protected J2117VThirdPartyCollectionReversalExport j2117VThirdPartyCollectionReversalResult;

    /**
     * Gets the value of the j2117VThirdPartyCollectionReversalResult property.
     * 
     * @return
     *     possible object is
     *     {@link J2117VThirdPartyCollectionReversalExport }
     *     
     */
    public J2117VThirdPartyCollectionReversalExport getJ2117VThirdPartyCollectionReversalResult() {
        return j2117VThirdPartyCollectionReversalResult;
    }

    /**
     * Sets the value of the j2117VThirdPartyCollectionReversalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link J2117VThirdPartyCollectionReversalExport }
     *     
     */
    public void setJ2117VThirdPartyCollectionReversalResult(J2117VThirdPartyCollectionReversalExport value) {
        this.j2117VThirdPartyCollectionReversalResult = value;
    }

}
