
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
 *         &lt;element name="D0325V_AuthorizeBeneficiaryAccountResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0325V_AuthorizeBeneficiaryAccountExport" minOccurs="0"/>
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
    "d0325VAuthorizeBeneficiaryAccountResult"
})
@XmlRootElement(name = "D0325V_AuthorizeBeneficiaryAccountResponse")
public class D0325VAuthorizeBeneficiaryAccountResponse {

    @XmlElement(name = "D0325V_AuthorizeBeneficiaryAccountResult")
    protected D0325VAuthorizeBeneficiaryAccountExport d0325VAuthorizeBeneficiaryAccountResult;

    /**
     * Gets the value of the d0325VAuthorizeBeneficiaryAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0325VAuthorizeBeneficiaryAccountExport }
     *     
     */
    public D0325VAuthorizeBeneficiaryAccountExport getD0325VAuthorizeBeneficiaryAccountResult() {
        return d0325VAuthorizeBeneficiaryAccountResult;
    }

    /**
     * Sets the value of the d0325VAuthorizeBeneficiaryAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0325VAuthorizeBeneficiaryAccountExport }
     *     
     */
    public void setD0325VAuthorizeBeneficiaryAccountResult(D0325VAuthorizeBeneficiaryAccountExport value) {
        this.d0325VAuthorizeBeneficiaryAccountResult = value;
    }

}
