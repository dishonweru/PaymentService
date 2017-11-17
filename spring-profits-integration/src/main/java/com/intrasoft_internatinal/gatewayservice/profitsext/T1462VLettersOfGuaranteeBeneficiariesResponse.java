
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
 *         &lt;element name="T1462V_LettersOfGuaranteeBeneficiariesResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1462VlgBeneficiariesExport" minOccurs="0"/>
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
    "t1462VLettersOfGuaranteeBeneficiariesResult"
})
@XmlRootElement(name = "T1462V_LettersOfGuaranteeBeneficiariesResponse")
public class T1462VLettersOfGuaranteeBeneficiariesResponse {

    @XmlElement(name = "T1462V_LettersOfGuaranteeBeneficiariesResult")
    protected T1462VlgBeneficiariesExport t1462VLettersOfGuaranteeBeneficiariesResult;

    /**
     * Gets the value of the t1462VLettersOfGuaranteeBeneficiariesResult property.
     * 
     * @return
     *     possible object is
     *     {@link T1462VlgBeneficiariesExport }
     *     
     */
    public T1462VlgBeneficiariesExport getT1462VLettersOfGuaranteeBeneficiariesResult() {
        return t1462VLettersOfGuaranteeBeneficiariesResult;
    }

    /**
     * Sets the value of the t1462VLettersOfGuaranteeBeneficiariesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T1462VlgBeneficiariesExport }
     *     
     */
    public void setT1462VLettersOfGuaranteeBeneficiariesResult(T1462VlgBeneficiariesExport value) {
        this.t1462VLettersOfGuaranteeBeneficiariesResult = value;
    }

}
