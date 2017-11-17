
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
 *         &lt;element name="RL215VL_LoanInterestResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RI215VL_LoanInterestExport" minOccurs="0"/>
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
    "rl215VLLoanInterestResult"
})
@XmlRootElement(name = "RL215VL_LoanInterestResponse")
public class RL215VLLoanInterestResponse {

    @XmlElement(name = "RL215VL_LoanInterestResult")
    protected RI215VLLoanInterestExport rl215VLLoanInterestResult;

    /**
     * Gets the value of the rl215VLLoanInterestResult property.
     * 
     * @return
     *     possible object is
     *     {@link RI215VLLoanInterestExport }
     *     
     */
    public RI215VLLoanInterestExport getRL215VLLoanInterestResult() {
        return rl215VLLoanInterestResult;
    }

    /**
     * Sets the value of the rl215VLLoanInterestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RI215VLLoanInterestExport }
     *     
     */
    public void setRL215VLLoanInterestResult(RI215VLLoanInterestExport value) {
        this.rl215VLLoanInterestResult = value;
    }

}
