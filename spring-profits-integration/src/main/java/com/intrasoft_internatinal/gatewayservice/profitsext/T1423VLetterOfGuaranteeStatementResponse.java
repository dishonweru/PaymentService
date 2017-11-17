
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
 *         &lt;element name="T1423V_LetterOfGuaranteeStatementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1423VLetterOfGuaranteeStatementExport" minOccurs="0"/>
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
    "t1423VLetterOfGuaranteeStatementResult"
})
@XmlRootElement(name = "T1423V_LetterOfGuaranteeStatementResponse")
public class T1423VLetterOfGuaranteeStatementResponse {

    @XmlElement(name = "T1423V_LetterOfGuaranteeStatementResult")
    protected T1423VLetterOfGuaranteeStatementExport t1423VLetterOfGuaranteeStatementResult;

    /**
     * Gets the value of the t1423VLetterOfGuaranteeStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link T1423VLetterOfGuaranteeStatementExport }
     *     
     */
    public T1423VLetterOfGuaranteeStatementExport getT1423VLetterOfGuaranteeStatementResult() {
        return t1423VLetterOfGuaranteeStatementResult;
    }

    /**
     * Sets the value of the t1423VLetterOfGuaranteeStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T1423VLetterOfGuaranteeStatementExport }
     *     
     */
    public void setT1423VLetterOfGuaranteeStatementResult(T1423VLetterOfGuaranteeStatementExport value) {
        this.t1423VLetterOfGuaranteeStatementResult = value;
    }

}
