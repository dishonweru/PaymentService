
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
 *         &lt;element name="CI3496V_ProfitsOtpValidateResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496V_ProfitsOtpValidateExport" minOccurs="0"/>
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
    "ci3496VProfitsOtpValidateResult"
})
@XmlRootElement(name = "CI3496V_ProfitsOtpValidateResponse")
public class CI3496VProfitsOtpValidateResponse {

    @XmlElement(name = "CI3496V_ProfitsOtpValidateResult")
    protected CI3496VProfitsOtpValidateExport ci3496VProfitsOtpValidateResult;

    /**
     * Gets the value of the ci3496VProfitsOtpValidateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI3496VProfitsOtpValidateExport }
     *     
     */
    public CI3496VProfitsOtpValidateExport getCI3496VProfitsOtpValidateResult() {
        return ci3496VProfitsOtpValidateResult;
    }

    /**
     * Sets the value of the ci3496VProfitsOtpValidateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI3496VProfitsOtpValidateExport }
     *     
     */
    public void setCI3496VProfitsOtpValidateResult(CI3496VProfitsOtpValidateExport value) {
        this.ci3496VProfitsOtpValidateResult = value;
    }

}
