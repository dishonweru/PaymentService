
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
 *         &lt;element name="D0350V_BalanceInquiryMiniStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BalanceInquiryMiniStatementExport" minOccurs="0"/>
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
    "d0350VBalanceInquiryMiniStatementResult"
})
@XmlRootElement(name = "D0350V_BalanceInquiryMiniStatementResponse")
public class D0350VBalanceInquiryMiniStatementResponse {

    @XmlElement(name = "D0350V_BalanceInquiryMiniStatementResult")
    protected BalanceInquiryMiniStatementExport d0350VBalanceInquiryMiniStatementResult;

    /**
     * Gets the value of the d0350VBalanceInquiryMiniStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryMiniStatementExport }
     *     
     */
    public BalanceInquiryMiniStatementExport getD0350VBalanceInquiryMiniStatementResult() {
        return d0350VBalanceInquiryMiniStatementResult;
    }

    /**
     * Sets the value of the d0350VBalanceInquiryMiniStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryMiniStatementExport }
     *     
     */
    public void setD0350VBalanceInquiryMiniStatementResult(BalanceInquiryMiniStatementExport value) {
        this.d0350VBalanceInquiryMiniStatementResult = value;
    }

}
