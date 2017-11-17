
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
 *         &lt;element name="D0367V_StatementRequestResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}StatementRequestExport" minOccurs="0"/>
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
    "d0367VStatementRequestResult"
})
@XmlRootElement(name = "D0367V_StatementRequestResponse")
public class D0367VStatementRequestResponse {

    @XmlElement(name = "D0367V_StatementRequestResult")
    protected StatementRequestExport d0367VStatementRequestResult;

    /**
     * Gets the value of the d0367VStatementRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatementRequestExport }
     *     
     */
    public StatementRequestExport getD0367VStatementRequestResult() {
        return d0367VStatementRequestResult;
    }

    /**
     * Sets the value of the d0367VStatementRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementRequestExport }
     *     
     */
    public void setD0367VStatementRequestResult(StatementRequestExport value) {
        this.d0367VStatementRequestResult = value;
    }

}
