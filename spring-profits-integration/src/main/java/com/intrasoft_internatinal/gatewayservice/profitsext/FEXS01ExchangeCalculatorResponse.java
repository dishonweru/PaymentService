
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
 *         &lt;element name="FEXS01_ExchangeCalculatorResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01_ExchangeCalculatorExport" minOccurs="0"/>
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
    "fexs01ExchangeCalculatorResult"
})
@XmlRootElement(name = "FEXS01_ExchangeCalculatorResponse")
public class FEXS01ExchangeCalculatorResponse {

    @XmlElement(name = "FEXS01_ExchangeCalculatorResult")
    protected FEXS01ExchangeCalculatorExport fexs01ExchangeCalculatorResult;

    /**
     * Gets the value of the fexs01ExchangeCalculatorResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXS01ExchangeCalculatorExport }
     *     
     */
    public FEXS01ExchangeCalculatorExport getFEXS01ExchangeCalculatorResult() {
        return fexs01ExchangeCalculatorResult;
    }

    /**
     * Sets the value of the fexs01ExchangeCalculatorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXS01ExchangeCalculatorExport }
     *     
     */
    public void setFEXS01ExchangeCalculatorResult(FEXS01ExchangeCalculatorExport value) {
        this.fexs01ExchangeCalculatorResult = value;
    }

}
