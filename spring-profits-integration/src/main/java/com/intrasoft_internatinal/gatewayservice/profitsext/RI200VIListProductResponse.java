
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
 *         &lt;element name="RI200VI_ListProductResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RI200VI_ListProductExport" minOccurs="0"/>
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
    "ri200VIListProductResult"
})
@XmlRootElement(name = "RI200VI_ListProductResponse")
public class RI200VIListProductResponse {

    @XmlElement(name = "RI200VI_ListProductResult")
    protected RI200VIListProductExport ri200VIListProductResult;

    /**
     * Gets the value of the ri200VIListProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link RI200VIListProductExport }
     *     
     */
    public RI200VIListProductExport getRI200VIListProductResult() {
        return ri200VIListProductResult;
    }

    /**
     * Sets the value of the ri200VIListProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RI200VIListProductExport }
     *     
     */
    public void setRI200VIListProductResult(RI200VIListProductExport value) {
        this.ri200VIListProductResult = value;
    }

}
