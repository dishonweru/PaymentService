
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
 *         &lt;element name="L0411V_AccountRepaymentScheduleResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}AccountRepaymentScheduleExport" minOccurs="0"/>
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
    "l0411VAccountRepaymentScheduleResult"
})
@XmlRootElement(name = "L0411V_AccountRepaymentScheduleResponse")
public class L0411VAccountRepaymentScheduleResponse {

    @XmlElement(name = "L0411V_AccountRepaymentScheduleResult")
    protected AccountRepaymentScheduleExport l0411VAccountRepaymentScheduleResult;

    /**
     * Gets the value of the l0411VAccountRepaymentScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRepaymentScheduleExport }
     *     
     */
    public AccountRepaymentScheduleExport getL0411VAccountRepaymentScheduleResult() {
        return l0411VAccountRepaymentScheduleResult;
    }

    /**
     * Sets the value of the l0411VAccountRepaymentScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRepaymentScheduleExport }
     *     
     */
    public void setL0411VAccountRepaymentScheduleResult(AccountRepaymentScheduleExport value) {
        this.l0411VAccountRepaymentScheduleResult = value;
    }

}
