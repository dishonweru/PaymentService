
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
 *         &lt;element name="D0357V_DepositsTermDepositStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0357VDepositsTermDepositStatementExport" minOccurs="0"/>
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
    "d0357VDepositsTermDepositStatementResult"
})
@XmlRootElement(name = "D0357V_DepositsTermDepositStatementResponse")
public class D0357VDepositsTermDepositStatementResponse {

    @XmlElement(name = "D0357V_DepositsTermDepositStatementResult")
    protected D0357VDepositsTermDepositStatementExport d0357VDepositsTermDepositStatementResult;

    /**
     * Gets the value of the d0357VDepositsTermDepositStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0357VDepositsTermDepositStatementExport }
     *     
     */
    public D0357VDepositsTermDepositStatementExport getD0357VDepositsTermDepositStatementResult() {
        return d0357VDepositsTermDepositStatementResult;
    }

    /**
     * Sets the value of the d0357VDepositsTermDepositStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0357VDepositsTermDepositStatementExport }
     *     
     */
    public void setD0357VDepositsTermDepositStatementResult(D0357VDepositsTermDepositStatementExport value) {
        this.d0357VDepositsTermDepositStatementResult = value;
    }

}
