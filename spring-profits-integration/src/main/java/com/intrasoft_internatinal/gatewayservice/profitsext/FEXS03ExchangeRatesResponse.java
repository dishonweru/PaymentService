
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
 *         &lt;element name="FEXS03_ExchangeRatesResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS03_ExchangeRatesExport" minOccurs="0"/>
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
    "fexs03ExchangeRatesResult"
})
@XmlRootElement(name = "FEXS03_ExchangeRatesResponse")
public class FEXS03ExchangeRatesResponse {

    @XmlElement(name = "FEXS03_ExchangeRatesResult")
    protected FEXS03ExchangeRatesExport fexs03ExchangeRatesResult;

    /**
     * Gets the value of the fexs03ExchangeRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXS03ExchangeRatesExport }
     *     
     */
    public FEXS03ExchangeRatesExport getFEXS03ExchangeRatesResult() {
        return fexs03ExchangeRatesResult;
    }

    /**
     * Sets the value of the fexs03ExchangeRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXS03ExchangeRatesExport }
     *     
     */
    public void setFEXS03ExchangeRatesResult(FEXS03ExchangeRatesExport value) {
        this.fexs03ExchangeRatesResult = value;
    }

}
