
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
 *         &lt;element name="FTRSC2_InterbankOutgoingOrderValueDateResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FTRSC2_InterbankOutgoingOrderValueDateImport" minOccurs="0"/>
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
    "ftrsc2InterbankOutgoingOrderValueDateResult"
})
@XmlRootElement(name = "FTRSC2_InterbankOutgoingOrderValueDateResponse")
public class FTRSC2InterbankOutgoingOrderValueDateResponse {

    @XmlElement(name = "FTRSC2_InterbankOutgoingOrderValueDateResult")
    protected FTRSC2InterbankOutgoingOrderValueDateImport ftrsc2InterbankOutgoingOrderValueDateResult;

    /**
     * Gets the value of the ftrsc2InterbankOutgoingOrderValueDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link FTRSC2InterbankOutgoingOrderValueDateImport }
     *     
     */
    public FTRSC2InterbankOutgoingOrderValueDateImport getFTRSC2InterbankOutgoingOrderValueDateResult() {
        return ftrsc2InterbankOutgoingOrderValueDateResult;
    }

    /**
     * Sets the value of the ftrsc2InterbankOutgoingOrderValueDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTRSC2InterbankOutgoingOrderValueDateImport }
     *     
     */
    public void setFTRSC2InterbankOutgoingOrderValueDateResult(FTRSC2InterbankOutgoingOrderValueDateImport value) {
        this.ftrsc2InterbankOutgoingOrderValueDateResult = value;
    }

}
