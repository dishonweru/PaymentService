
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
 *         &lt;element name="T2104V_StandingOrderExecutionHistoryResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2104V_StandingOrdersInquiryExport" minOccurs="0"/>
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
    "t2104VStandingOrderExecutionHistoryResult"
})
@XmlRootElement(name = "T2104V_StandingOrderExecutionHistoryResponse")
public class T2104VStandingOrderExecutionHistoryResponse {

    @XmlElement(name = "T2104V_StandingOrderExecutionHistoryResult")
    protected T2104VStandingOrdersInquiryExport t2104VStandingOrderExecutionHistoryResult;

    /**
     * Gets the value of the t2104VStandingOrderExecutionHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2104VStandingOrdersInquiryExport }
     *     
     */
    public T2104VStandingOrdersInquiryExport getT2104VStandingOrderExecutionHistoryResult() {
        return t2104VStandingOrderExecutionHistoryResult;
    }

    /**
     * Sets the value of the t2104VStandingOrderExecutionHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2104VStandingOrdersInquiryExport }
     *     
     */
    public void setT2104VStandingOrderExecutionHistoryResult(T2104VStandingOrdersInquiryExport value) {
        this.t2104VStandingOrderExecutionHistoryResult = value;
    }

}
