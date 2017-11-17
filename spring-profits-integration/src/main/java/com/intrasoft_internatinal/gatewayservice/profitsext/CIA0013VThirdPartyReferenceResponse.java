
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
 *         &lt;element name="CIA0013V_ThirdPartyReferenceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CIA0013VThirdPartyReferenceExport" minOccurs="0"/>
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
    "cia0013VThirdPartyReferenceResult"
})
@XmlRootElement(name = "CIA0013V_ThirdPartyReferenceResponse")
public class CIA0013VThirdPartyReferenceResponse {

    @XmlElement(name = "CIA0013V_ThirdPartyReferenceResult")
    protected CIA0013VThirdPartyReferenceExport cia0013VThirdPartyReferenceResult;

    /**
     * Gets the value of the cia0013VThirdPartyReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CIA0013VThirdPartyReferenceExport }
     *     
     */
    public CIA0013VThirdPartyReferenceExport getCIA0013VThirdPartyReferenceResult() {
        return cia0013VThirdPartyReferenceResult;
    }

    /**
     * Sets the value of the cia0013VThirdPartyReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIA0013VThirdPartyReferenceExport }
     *     
     */
    public void setCIA0013VThirdPartyReferenceResult(CIA0013VThirdPartyReferenceExport value) {
        this.cia0013VThirdPartyReferenceResult = value;
    }

}
