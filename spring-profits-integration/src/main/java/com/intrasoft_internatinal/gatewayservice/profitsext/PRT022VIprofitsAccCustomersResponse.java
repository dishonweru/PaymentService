
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
 *         &lt;element name="PRT022V_IprofitsAccCustomersResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PRT022V_IprofitsAccCustomersExport" minOccurs="0"/>
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
    "prt022VIprofitsAccCustomersResult"
})
@XmlRootElement(name = "PRT022V_IprofitsAccCustomersResponse")
public class PRT022VIprofitsAccCustomersResponse {

    @XmlElement(name = "PRT022V_IprofitsAccCustomersResult")
    protected PRT022VIprofitsAccCustomersExport prt022VIprofitsAccCustomersResult;

    /**
     * Gets the value of the prt022VIprofitsAccCustomersResult property.
     * 
     * @return
     *     possible object is
     *     {@link PRT022VIprofitsAccCustomersExport }
     *     
     */
    public PRT022VIprofitsAccCustomersExport getPRT022VIprofitsAccCustomersResult() {
        return prt022VIprofitsAccCustomersResult;
    }

    /**
     * Sets the value of the prt022VIprofitsAccCustomersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRT022VIprofitsAccCustomersExport }
     *     
     */
    public void setPRT022VIprofitsAccCustomersResult(PRT022VIprofitsAccCustomersExport value) {
        this.prt022VIprofitsAccCustomersResult = value;
    }

}
