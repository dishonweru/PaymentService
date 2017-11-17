
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
 *         &lt;element name="FEXS09_DealerSpecialRatesMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DealerSpecialRatesMaintenanceExport" minOccurs="0"/>
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
    "fexs09DealerSpecialRatesMaintenanceResult"
})
@XmlRootElement(name = "FEXS09_DealerSpecialRatesMaintenanceResponse")
public class FEXS09DealerSpecialRatesMaintenanceResponse {

    @XmlElement(name = "FEXS09_DealerSpecialRatesMaintenanceResult")
    protected DealerSpecialRatesMaintenanceExport fexs09DealerSpecialRatesMaintenanceResult;

    /**
     * Gets the value of the fexs09DealerSpecialRatesMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DealerSpecialRatesMaintenanceExport }
     *     
     */
    public DealerSpecialRatesMaintenanceExport getFEXS09DealerSpecialRatesMaintenanceResult() {
        return fexs09DealerSpecialRatesMaintenanceResult;
    }

    /**
     * Sets the value of the fexs09DealerSpecialRatesMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealerSpecialRatesMaintenanceExport }
     *     
     */
    public void setFEXS09DealerSpecialRatesMaintenanceResult(DealerSpecialRatesMaintenanceExport value) {
        this.fexs09DealerSpecialRatesMaintenanceResult = value;
    }

}
