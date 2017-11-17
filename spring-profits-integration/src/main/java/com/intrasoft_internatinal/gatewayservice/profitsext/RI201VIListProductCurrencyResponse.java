
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
 *         &lt;element name="RI201VI_ListProductCurrencyResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RI201VI_ListProductCurrencyExport" minOccurs="0"/>
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
    "ri201VIListProductCurrencyResult"
})
@XmlRootElement(name = "RI201VI_ListProductCurrencyResponse")
public class RI201VIListProductCurrencyResponse {

    @XmlElement(name = "RI201VI_ListProductCurrencyResult")
    protected RI201VIListProductCurrencyExport ri201VIListProductCurrencyResult;

    /**
     * Gets the value of the ri201VIListProductCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link RI201VIListProductCurrencyExport }
     *     
     */
    public RI201VIListProductCurrencyExport getRI201VIListProductCurrencyResult() {
        return ri201VIListProductCurrencyResult;
    }

    /**
     * Sets the value of the ri201VIListProductCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RI201VIListProductCurrencyExport }
     *     
     */
    public void setRI201VIListProductCurrencyResult(RI201VIListProductCurrencyExport value) {
        this.ri201VIListProductCurrencyResult = value;
    }

}
