
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
 *         &lt;element name="D0306V_BeneficiaryDisplayResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0306V_BeneficiaryDisplayExport" minOccurs="0"/>
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
    "d0306VBeneficiaryDisplayResult"
})
@XmlRootElement(name = "D0306V_BeneficiaryDisplayResponse")
public class D0306VBeneficiaryDisplayResponse {

    @XmlElement(name = "D0306V_BeneficiaryDisplayResult")
    protected D0306VBeneficiaryDisplayExport d0306VBeneficiaryDisplayResult;

    /**
     * Gets the value of the d0306VBeneficiaryDisplayResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0306VBeneficiaryDisplayExport }
     *     
     */
    public D0306VBeneficiaryDisplayExport getD0306VBeneficiaryDisplayResult() {
        return d0306VBeneficiaryDisplayResult;
    }

    /**
     * Sets the value of the d0306VBeneficiaryDisplayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0306VBeneficiaryDisplayExport }
     *     
     */
    public void setD0306VBeneficiaryDisplayResult(D0306VBeneficiaryDisplayExport value) {
        this.d0306VBeneficiaryDisplayResult = value;
    }

}
