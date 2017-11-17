
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
 *         &lt;element name="TF3701V_TradeFinanceAccountMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}TradeFinanceAccountRetrieveExport" minOccurs="0"/>
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
    "tf3701VTradeFinanceAccountMaintenanceResult"
})
@XmlRootElement(name = "TF3701V_TradeFinanceAccountMaintenanceResponse")
public class TF3701VTradeFinanceAccountMaintenanceResponse {

    @XmlElement(name = "TF3701V_TradeFinanceAccountMaintenanceResult")
    protected TradeFinanceAccountRetrieveExport tf3701VTradeFinanceAccountMaintenanceResult;

    /**
     * Gets the value of the tf3701VTradeFinanceAccountMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinanceAccountRetrieveExport }
     *     
     */
    public TradeFinanceAccountRetrieveExport getTF3701VTradeFinanceAccountMaintenanceResult() {
        return tf3701VTradeFinanceAccountMaintenanceResult;
    }

    /**
     * Sets the value of the tf3701VTradeFinanceAccountMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinanceAccountRetrieveExport }
     *     
     */
    public void setTF3701VTradeFinanceAccountMaintenanceResult(TradeFinanceAccountRetrieveExport value) {
        this.tf3701VTradeFinanceAccountMaintenanceResult = value;
    }

}
