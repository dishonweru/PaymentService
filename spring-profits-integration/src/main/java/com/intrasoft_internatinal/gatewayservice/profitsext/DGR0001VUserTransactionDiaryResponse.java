
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
 *         &lt;element name="DGR0001V_UserTransactionDiaryResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DGR0001V_UserTransactionDiaryExport" minOccurs="0"/>
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
    "dgr0001VUserTransactionDiaryResult"
})
@XmlRootElement(name = "DGR0001V_UserTransactionDiaryResponse")
public class DGR0001VUserTransactionDiaryResponse {

    @XmlElement(name = "DGR0001V_UserTransactionDiaryResult")
    protected DGR0001VUserTransactionDiaryExport dgr0001VUserTransactionDiaryResult;

    /**
     * Gets the value of the dgr0001VUserTransactionDiaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link DGR0001VUserTransactionDiaryExport }
     *     
     */
    public DGR0001VUserTransactionDiaryExport getDGR0001VUserTransactionDiaryResult() {
        return dgr0001VUserTransactionDiaryResult;
    }

    /**
     * Sets the value of the dgr0001VUserTransactionDiaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DGR0001VUserTransactionDiaryExport }
     *     
     */
    public void setDGR0001VUserTransactionDiaryResult(DGR0001VUserTransactionDiaryExport value) {
        this.dgr0001VUserTransactionDiaryResult = value;
    }

}
