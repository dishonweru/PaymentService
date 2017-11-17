
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
 *         &lt;element name="T2103V_StandingOrdersInquiryResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2103V_StandingOrderTransferListExport" minOccurs="0"/>
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
    "t2103VStandingOrdersInquiryResult"
})
@XmlRootElement(name = "T2103V_StandingOrdersInquiryResponse")
public class T2103VStandingOrdersInquiryResponse {

    @XmlElement(name = "T2103V_StandingOrdersInquiryResult")
    protected T2103VStandingOrderTransferListExport t2103VStandingOrdersInquiryResult;

    /**
     * Gets the value of the t2103VStandingOrdersInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link T2103VStandingOrderTransferListExport }
     *     
     */
    public T2103VStandingOrderTransferListExport getT2103VStandingOrdersInquiryResult() {
        return t2103VStandingOrdersInquiryResult;
    }

    /**
     * Sets the value of the t2103VStandingOrdersInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T2103VStandingOrderTransferListExport }
     *     
     */
    public void setT2103VStandingOrdersInquiryResult(T2103VStandingOrderTransferListExport value) {
        this.t2103VStandingOrdersInquiryResult = value;
    }

}
