
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
 *         &lt;element name="CI3496V_ProfitsOtpUserProcessResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496V_ProfitsOtpUserProcessExport" minOccurs="0"/>
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
    "ci3496VProfitsOtpUserProcessResult"
})
@XmlRootElement(name = "CI3496V_ProfitsOtpUserProcessResponse")
public class CI3496VProfitsOtpUserProcessResponse {

    @XmlElement(name = "CI3496V_ProfitsOtpUserProcessResult")
    protected CI3496VProfitsOtpUserProcessExport ci3496VProfitsOtpUserProcessResult;

    /**
     * Gets the value of the ci3496VProfitsOtpUserProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link CI3496VProfitsOtpUserProcessExport }
     *     
     */
    public CI3496VProfitsOtpUserProcessExport getCI3496VProfitsOtpUserProcessResult() {
        return ci3496VProfitsOtpUserProcessResult;
    }

    /**
     * Sets the value of the ci3496VProfitsOtpUserProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CI3496VProfitsOtpUserProcessExport }
     *     
     */
    public void setCI3496VProfitsOtpUserProcessResult(CI3496VProfitsOtpUserProcessExport value) {
        this.ci3496VProfitsOtpUserProcessResult = value;
    }

}
