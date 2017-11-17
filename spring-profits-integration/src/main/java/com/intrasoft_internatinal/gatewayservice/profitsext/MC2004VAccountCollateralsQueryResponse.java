
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
 *         &lt;element name="MC2004V_AccountCollateralsQueryResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2004VAccountCollateralsQueryExport" minOccurs="0"/>
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
    "mc2004VAccountCollateralsQueryResult"
})
@XmlRootElement(name = "MC2004V_AccountCollateralsQueryResponse")
public class MC2004VAccountCollateralsQueryResponse {

    @XmlElement(name = "MC2004V_AccountCollateralsQueryResult")
    protected MC2004VAccountCollateralsQueryExport mc2004VAccountCollateralsQueryResult;

    /**
     * Gets the value of the mc2004VAccountCollateralsQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2004VAccountCollateralsQueryExport }
     *     
     */
    public MC2004VAccountCollateralsQueryExport getMC2004VAccountCollateralsQueryResult() {
        return mc2004VAccountCollateralsQueryResult;
    }

    /**
     * Sets the value of the mc2004VAccountCollateralsQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2004VAccountCollateralsQueryExport }
     *     
     */
    public void setMC2004VAccountCollateralsQueryResult(MC2004VAccountCollateralsQueryExport value) {
        this.mc2004VAccountCollateralsQueryResult = value;
    }

}
