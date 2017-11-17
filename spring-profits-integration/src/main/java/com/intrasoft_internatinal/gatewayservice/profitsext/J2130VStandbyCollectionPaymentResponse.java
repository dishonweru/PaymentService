
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
 *         &lt;element name="J2130v_StandbyCollectionPaymentResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}StandbyCollectionPaymentExport" minOccurs="0"/>
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
    "j2130VStandbyCollectionPaymentResult"
})
@XmlRootElement(name = "J2130v_StandbyCollectionPaymentResponse")
public class J2130VStandbyCollectionPaymentResponse {

    @XmlElement(name = "J2130v_StandbyCollectionPaymentResult")
    protected StandbyCollectionPaymentExport j2130VStandbyCollectionPaymentResult;

    /**
     * Gets the value of the j2130VStandbyCollectionPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link StandbyCollectionPaymentExport }
     *     
     */
    public StandbyCollectionPaymentExport getJ2130VStandbyCollectionPaymentResult() {
        return j2130VStandbyCollectionPaymentResult;
    }

    /**
     * Sets the value of the j2130VStandbyCollectionPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandbyCollectionPaymentExport }
     *     
     */
    public void setJ2130VStandbyCollectionPaymentResult(StandbyCollectionPaymentExport value) {
        this.j2130VStandbyCollectionPaymentResult = value;
    }

}
