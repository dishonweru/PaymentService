
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
 *         &lt;element name="DTF099V_ElectronicFundsTransferResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DTF099V_ElectronicFundsTransferExport" minOccurs="0"/>
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
    "dtf099VElectronicFundsTransferResult"
})
@XmlRootElement(name = "DTF099V_ElectronicFundsTransferResponse")
public class DTF099VElectronicFundsTransferResponse {

    @XmlElement(name = "DTF099V_ElectronicFundsTransferResult")
    protected DTF099VElectronicFundsTransferExport dtf099VElectronicFundsTransferResult;

    /**
     * Gets the value of the dtf099VElectronicFundsTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link DTF099VElectronicFundsTransferExport }
     *     
     */
    public DTF099VElectronicFundsTransferExport getDTF099VElectronicFundsTransferResult() {
        return dtf099VElectronicFundsTransferResult;
    }

    /**
     * Sets the value of the dtf099VElectronicFundsTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTF099VElectronicFundsTransferExport }
     *     
     */
    public void setDTF099VElectronicFundsTransferResult(DTF099VElectronicFundsTransferExport value) {
        this.dtf099VElectronicFundsTransferResult = value;
    }

}
