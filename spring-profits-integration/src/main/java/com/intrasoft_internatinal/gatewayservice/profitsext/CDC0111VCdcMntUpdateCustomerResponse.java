
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
 *         &lt;element name="CDC0111V_CdcMntUpdateCustomerResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CdcMntUpdateCustomerExport" minOccurs="0"/>
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
    "cdc0111VCdcMntUpdateCustomerResult"
})
@XmlRootElement(name = "CDC0111V_CdcMntUpdateCustomerResponse")
public class CDC0111VCdcMntUpdateCustomerResponse {

    @XmlElement(name = "CDC0111V_CdcMntUpdateCustomerResult")
    protected CdcMntUpdateCustomerExport cdc0111VCdcMntUpdateCustomerResult;

    /**
     * Gets the value of the cdc0111VCdcMntUpdateCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link CdcMntUpdateCustomerExport }
     *     
     */
    public CdcMntUpdateCustomerExport getCDC0111VCdcMntUpdateCustomerResult() {
        return cdc0111VCdcMntUpdateCustomerResult;
    }

    /**
     * Sets the value of the cdc0111VCdcMntUpdateCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdcMntUpdateCustomerExport }
     *     
     */
    public void setCDC0111VCdcMntUpdateCustomerResult(CdcMntUpdateCustomerExport value) {
        this.cdc0111VCdcMntUpdateCustomerResult = value;
    }

}
