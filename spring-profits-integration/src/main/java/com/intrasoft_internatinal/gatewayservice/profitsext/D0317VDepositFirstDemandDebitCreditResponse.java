
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
 *         &lt;element name="D0317V_DepositFirstDemand_DebitCreditResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DepositFirstDemandWithdrawExport" minOccurs="0"/>
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
    "d0317VDepositFirstDemandDebitCreditResult"
})
@XmlRootElement(name = "D0317V_DepositFirstDemand_DebitCreditResponse")
public class D0317VDepositFirstDemandDebitCreditResponse {

    @XmlElement(name = "D0317V_DepositFirstDemand_DebitCreditResult")
    protected DepositFirstDemandWithdrawExport d0317VDepositFirstDemandDebitCreditResult;

    /**
     * Gets the value of the d0317VDepositFirstDemandDebitCreditResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepositFirstDemandWithdrawExport }
     *     
     */
    public DepositFirstDemandWithdrawExport getD0317VDepositFirstDemandDebitCreditResult() {
        return d0317VDepositFirstDemandDebitCreditResult;
    }

    /**
     * Sets the value of the d0317VDepositFirstDemandDebitCreditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositFirstDemandWithdrawExport }
     *     
     */
    public void setD0317VDepositFirstDemandDebitCreditResult(DepositFirstDemandWithdrawExport value) {
        this.d0317VDepositFirstDemandDebitCreditResult = value;
    }

}
