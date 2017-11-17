
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
 *         &lt;element name="D0362V_ChequeBookRequestResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ChequeBookRequestExport" minOccurs="0"/>
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
    "d0362VChequeBookRequestResult"
})
@XmlRootElement(name = "D0362V_ChequeBookRequestResponse")
public class D0362VChequeBookRequestResponse {

    @XmlElement(name = "D0362V_ChequeBookRequestResult")
    protected ChequeBookRequestExport d0362VChequeBookRequestResult;

    /**
     * Gets the value of the d0362VChequeBookRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeBookRequestExport }
     *     
     */
    public ChequeBookRequestExport getD0362VChequeBookRequestResult() {
        return d0362VChequeBookRequestResult;
    }

    /**
     * Sets the value of the d0362VChequeBookRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeBookRequestExport }
     *     
     */
    public void setD0362VChequeBookRequestResult(ChequeBookRequestExport value) {
        this.d0362VChequeBookRequestResult = value;
    }

}
