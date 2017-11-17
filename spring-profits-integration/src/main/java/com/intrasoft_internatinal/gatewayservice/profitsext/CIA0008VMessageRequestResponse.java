
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
 *         &lt;element name="CIA0008V_MessageRequestResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0008V_MessageRequestExport" minOccurs="0"/>
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
    "cia0008VMessageRequestResult"
})
@XmlRootElement(name = "CIA0008V_MessageRequestResponse")
public class CIA0008VMessageRequestResponse {

    @XmlElement(name = "CIA0008V_MessageRequestResult")
    protected CIA0008VMessageRequestExport cia0008VMessageRequestResult;

    /**
     * Gets the value of the cia0008VMessageRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link CIA0008VMessageRequestExport }
     *     
     */
    public CIA0008VMessageRequestExport getCIA0008VMessageRequestResult() {
        return cia0008VMessageRequestResult;
    }

    /**
     * Sets the value of the cia0008VMessageRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIA0008VMessageRequestExport }
     *     
     */
    public void setCIA0008VMessageRequestResult(CIA0008VMessageRequestExport value) {
        this.cia0008VMessageRequestResult = value;
    }

}
