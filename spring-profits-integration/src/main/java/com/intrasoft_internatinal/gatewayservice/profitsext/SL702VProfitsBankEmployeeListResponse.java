
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
 *         &lt;element name="SL702V_ProfitsBankEmployeeListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SL702VProfitsBankEmployeeListExport" minOccurs="0"/>
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
    "sl702VProfitsBankEmployeeListResult"
})
@XmlRootElement(name = "SL702V_ProfitsBankEmployeeListResponse")
public class SL702VProfitsBankEmployeeListResponse {

    @XmlElement(name = "SL702V_ProfitsBankEmployeeListResult")
    protected SL702VProfitsBankEmployeeListExport sl702VProfitsBankEmployeeListResult;

    /**
     * Gets the value of the sl702VProfitsBankEmployeeListResult property.
     * 
     * @return
     *     possible object is
     *     {@link SL702VProfitsBankEmployeeListExport }
     *     
     */
    public SL702VProfitsBankEmployeeListExport getSL702VProfitsBankEmployeeListResult() {
        return sl702VProfitsBankEmployeeListResult;
    }

    /**
     * Sets the value of the sl702VProfitsBankEmployeeListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SL702VProfitsBankEmployeeListExport }
     *     
     */
    public void setSL702VProfitsBankEmployeeListResult(SL702VProfitsBankEmployeeListExport value) {
        this.sl702VProfitsBankEmployeeListResult = value;
    }

}
