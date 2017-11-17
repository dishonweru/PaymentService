
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
 *         &lt;element name="BI1634V_DhsseclearingResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BI1634VDhsseclearingExport" minOccurs="0"/>
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
    "bi1634VDhsseclearingResult"
})
@XmlRootElement(name = "BI1634V_DhsseclearingResponse")
public class BI1634VDhsseclearingResponse {

    @XmlElement(name = "BI1634V_DhsseclearingResult")
    protected BI1634VDhsseclearingExport bi1634VDhsseclearingResult;

    /**
     * Gets the value of the bi1634VDhsseclearingResult property.
     * 
     * @return
     *     possible object is
     *     {@link BI1634VDhsseclearingExport }
     *     
     */
    public BI1634VDhsseclearingExport getBI1634VDhsseclearingResult() {
        return bi1634VDhsseclearingResult;
    }

    /**
     * Sets the value of the bi1634VDhsseclearingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BI1634VDhsseclearingExport }
     *     
     */
    public void setBI1634VDhsseclearingResult(BI1634VDhsseclearingExport value) {
        this.bi1634VDhsseclearingResult = value;
    }

}
