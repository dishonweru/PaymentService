
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
 *         &lt;element name="D0302V_ChargeableBalanceInquiryResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DepositAccountRetrieveExport" minOccurs="0"/>
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
    "d0302VChargeableBalanceInquiryResult"
})
@XmlRootElement(name = "D0302V_ChargeableBalanceInquiryResponse")
public class D0302VChargeableBalanceInquiryResponse {

    @XmlElement(name = "D0302V_ChargeableBalanceInquiryResult")
    protected DepositAccountRetrieveExport d0302VChargeableBalanceInquiryResult;

    /**
     * Gets the value of the d0302VChargeableBalanceInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepositAccountRetrieveExport }
     *     
     */
    public DepositAccountRetrieveExport getD0302VChargeableBalanceInquiryResult() {
        return d0302VChargeableBalanceInquiryResult;
    }

    /**
     * Sets the value of the d0302VChargeableBalanceInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositAccountRetrieveExport }
     *     
     */
    public void setD0302VChargeableBalanceInquiryResult(DepositAccountRetrieveExport value) {
        this.d0302VChargeableBalanceInquiryResult = value;
    }

}
