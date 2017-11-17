
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
 *         &lt;element name="CI3496V_ProfitsOtpRequestResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496V_ProfitsOtpRequestExport" minOccurs="0"/>
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
    "ci3496VProfitsOtpRequestResult"
})
@XmlRootElement(name = "CI3496V_ProfitsOtpRequestResponse")
public class CI3496VProfitsOtpRequestResponse {

    @XmlElement(name = "CI3496V_ProfitsOtpRequestResult")
    protected CI3496VProfitsOtpRequestExport ci3496VProfitsOtpRequestResult;

    /**
     * Gets the value of the ci3496VProfitsOtpRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI3496VProfitsOtpRequestExport }
     *     
     */
    public CI3496VProfitsOtpRequestExport getCI3496VProfitsOtpRequestResult() {
        return ci3496VProfitsOtpRequestResult;
    }

    /**
     * Sets the value of the ci3496VProfitsOtpRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI3496VProfitsOtpRequestExport }
     *     
     */
    public void setCI3496VProfitsOtpRequestResult(CI3496VProfitsOtpRequestExport value) {
        this.ci3496VProfitsOtpRequestResult = value;
    }

}
