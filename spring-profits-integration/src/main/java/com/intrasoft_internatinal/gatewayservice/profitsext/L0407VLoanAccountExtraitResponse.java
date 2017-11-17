
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
 *         &lt;element name="L0407V_LoanAccountExtraitResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0407VLoanAccountExtraitExport" minOccurs="0"/>
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
    "l0407VLoanAccountExtraitResult"
})
@XmlRootElement(name = "L0407V_LoanAccountExtraitResponse")
public class L0407VLoanAccountExtraitResponse {

    @XmlElement(name = "L0407V_LoanAccountExtraitResult")
    protected L0407VLoanAccountExtraitExport l0407VLoanAccountExtraitResult;

    /**
     * Gets the value of the l0407VLoanAccountExtraitResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0407VLoanAccountExtraitExport }
     *     
     */
    public L0407VLoanAccountExtraitExport getL0407VLoanAccountExtraitResult() {
        return l0407VLoanAccountExtraitResult;
    }

    /**
     * Sets the value of the l0407VLoanAccountExtraitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0407VLoanAccountExtraitExport }
     *     
     */
    public void setL0407VLoanAccountExtraitResult(L0407VLoanAccountExtraitExport value) {
        this.l0407VLoanAccountExtraitResult = value;
    }

}
