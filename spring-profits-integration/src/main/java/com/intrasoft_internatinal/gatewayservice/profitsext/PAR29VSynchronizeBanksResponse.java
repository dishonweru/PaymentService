
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
 *         &lt;element name="PAR29V_SynchronizeBanksResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PAR29V_SynchronizeBanksExport" minOccurs="0"/>
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
    "par29VSynchronizeBanksResult"
})
@XmlRootElement(name = "PAR29V_SynchronizeBanksResponse")
public class PAR29VSynchronizeBanksResponse {

    @XmlElement(name = "PAR29V_SynchronizeBanksResult")
    protected PAR29VSynchronizeBanksExport par29VSynchronizeBanksResult;

    /**
     * Gets the value of the par29VSynchronizeBanksResult property.
     * 
     * @return
     *     possible object is
     *     {@link PAR29VSynchronizeBanksExport }
     *     
     */
    public PAR29VSynchronizeBanksExport getPAR29VSynchronizeBanksResult() {
        return par29VSynchronizeBanksResult;
    }

    /**
     * Sets the value of the par29VSynchronizeBanksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAR29VSynchronizeBanksExport }
     *     
     */
    public void setPAR29VSynchronizeBanksResult(PAR29VSynchronizeBanksExport value) {
        this.par29VSynchronizeBanksResult = value;
    }

}
