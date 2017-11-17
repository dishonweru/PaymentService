
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
 *         &lt;element name="Prt501V_ExternalTaskCheckResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Prt501VExternalTaskCheckExport" minOccurs="0"/>
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
    "prt501VExternalTaskCheckResult"
})
@XmlRootElement(name = "Prt501V_ExternalTaskCheckResponse")
public class Prt501VExternalTaskCheckResponse {

    @XmlElement(name = "Prt501V_ExternalTaskCheckResult")
    protected Prt501VExternalTaskCheckExport prt501VExternalTaskCheckResult;

    /**
     * Gets the value of the prt501VExternalTaskCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link Prt501VExternalTaskCheckExport }
     *     
     */
    public Prt501VExternalTaskCheckExport getPrt501VExternalTaskCheckResult() {
        return prt501VExternalTaskCheckResult;
    }

    /**
     * Sets the value of the prt501VExternalTaskCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prt501VExternalTaskCheckExport }
     *     
     */
    public void setPrt501VExternalTaskCheckResult(Prt501VExternalTaskCheckExport value) {
        this.prt501VExternalTaskCheckResult = value;
    }

}
