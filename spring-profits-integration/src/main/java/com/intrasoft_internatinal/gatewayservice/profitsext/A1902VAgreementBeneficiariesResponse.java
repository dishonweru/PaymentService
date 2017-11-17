
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
 *         &lt;element name="A1902V_AgreementBeneficiariesResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}AgreementBeneficiariesExport" minOccurs="0"/>
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
    "a1902VAgreementBeneficiariesResult"
})
@XmlRootElement(name = "A1902V_AgreementBeneficiariesResponse")
public class A1902VAgreementBeneficiariesResponse {

    @XmlElement(name = "A1902V_AgreementBeneficiariesResult")
    protected AgreementBeneficiariesExport a1902VAgreementBeneficiariesResult;

    /**
     * Gets the value of the a1902VAgreementBeneficiariesResult property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementBeneficiariesExport }
     *     
     */
    public AgreementBeneficiariesExport getA1902VAgreementBeneficiariesResult() {
        return a1902VAgreementBeneficiariesResult;
    }

    /**
     * Sets the value of the a1902VAgreementBeneficiariesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementBeneficiariesExport }
     *     
     */
    public void setA1902VAgreementBeneficiariesResult(AgreementBeneficiariesExport value) {
        this.a1902VAgreementBeneficiariesResult = value;
    }

}
