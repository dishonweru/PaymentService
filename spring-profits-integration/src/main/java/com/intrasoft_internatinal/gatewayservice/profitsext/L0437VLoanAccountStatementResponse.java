
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
 *         &lt;element name="L0437V_LoanAccountStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0437VLoanAccountStatementExport" minOccurs="0"/>
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
    "l0437VLoanAccountStatementResult"
})
@XmlRootElement(name = "L0437V_LoanAccountStatementResponse")
public class L0437VLoanAccountStatementResponse {

    @XmlElement(name = "L0437V_LoanAccountStatementResult")
    protected L0437VLoanAccountStatementExport l0437VLoanAccountStatementResult;

    /**
     * Gets the value of the l0437VLoanAccountStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0437VLoanAccountStatementExport }
     *     
     */
    public L0437VLoanAccountStatementExport getL0437VLoanAccountStatementResult() {
        return l0437VLoanAccountStatementResult;
    }

    /**
     * Sets the value of the l0437VLoanAccountStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0437VLoanAccountStatementExport }
     *     
     */
    public void setL0437VLoanAccountStatementResult(L0437VLoanAccountStatementExport value) {
        this.l0437VLoanAccountStatementResult = value;
    }

}
