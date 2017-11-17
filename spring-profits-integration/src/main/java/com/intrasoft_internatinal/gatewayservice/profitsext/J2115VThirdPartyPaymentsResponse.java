
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
 *         &lt;element name="J2115V_ThirdPartyPaymentsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}J2115V_ThirdPartyPaymentsExport" minOccurs="0"/>
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
    "j2115VThirdPartyPaymentsResult"
})
@XmlRootElement(name = "J2115V_ThirdPartyPaymentsResponse")
public class J2115VThirdPartyPaymentsResponse {

    @XmlElement(name = "J2115V_ThirdPartyPaymentsResult")
    protected J2115VThirdPartyPaymentsExport j2115VThirdPartyPaymentsResult;

    /**
     * Gets the value of the j2115VThirdPartyPaymentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link J2115VThirdPartyPaymentsExport }
     *     
     */
    public J2115VThirdPartyPaymentsExport getJ2115VThirdPartyPaymentsResult() {
        return j2115VThirdPartyPaymentsResult;
    }

    /**
     * Sets the value of the j2115VThirdPartyPaymentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link J2115VThirdPartyPaymentsExport }
     *     
     */
    public void setJ2115VThirdPartyPaymentsResult(J2115VThirdPartyPaymentsExport value) {
        this.j2115VThirdPartyPaymentsResult = value;
    }

}
