
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
 *         &lt;element name="D0350V_ChargeableMinistatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BalanceInquiryMiniStatementExport" minOccurs="0"/>
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
    "d0350VChargeableMinistatementResult"
})
@XmlRootElement(name = "D0350V_ChargeableMinistatementResponse")
public class D0350VChargeableMinistatementResponse {

    @XmlElement(name = "D0350V_ChargeableMinistatementResult")
    protected BalanceInquiryMiniStatementExport d0350VChargeableMinistatementResult;

    /**
     * Gets the value of the d0350VChargeableMinistatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryMiniStatementExport }
     *     
     */
    public BalanceInquiryMiniStatementExport getD0350VChargeableMinistatementResult() {
        return d0350VChargeableMinistatementResult;
    }

    /**
     * Sets the value of the d0350VChargeableMinistatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryMiniStatementExport }
     *     
     */
    public void setD0350VChargeableMinistatementResult(BalanceInquiryMiniStatementExport value) {
        this.d0350VChargeableMinistatementResult = value;
    }

}
