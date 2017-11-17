
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
 *         &lt;element name="DTF078V_DiasTransaferBanksResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DTF078V_DiasTransaferBanksExport" minOccurs="0"/>
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
    "dtf078VDiasTransaferBanksResult"
})
@XmlRootElement(name = "DTF078V_DiasTransaferBanksResponse")
public class DTF078VDiasTransaferBanksResponse {

    @XmlElement(name = "DTF078V_DiasTransaferBanksResult")
    protected DTF078VDiasTransaferBanksExport dtf078VDiasTransaferBanksResult;

    /**
     * Gets the value of the dtf078VDiasTransaferBanksResult property.
     * 
     * @return
     *     possible object is
     *     {@link DTF078VDiasTransaferBanksExport }
     *     
     */
    public DTF078VDiasTransaferBanksExport getDTF078VDiasTransaferBanksResult() {
        return dtf078VDiasTransaferBanksResult;
    }

    /**
     * Sets the value of the dtf078VDiasTransaferBanksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTF078VDiasTransaferBanksExport }
     *     
     */
    public void setDTF078VDiasTransaferBanksResult(DTF078VDiasTransaferBanksExport value) {
        this.dtf078VDiasTransaferBanksResult = value;
    }

}
