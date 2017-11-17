
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
 *         &lt;element name="Prt022VValidationAccountResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Prt022VValidationAccountExport" minOccurs="0"/>
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
    "prt022VValidationAccountResult"
})
@XmlRootElement(name = "Prt022VValidationAccountResponse")
public class Prt022VValidationAccountResponse {

    @XmlElement(name = "Prt022VValidationAccountResult")
    protected Prt022VValidationAccountExport prt022VValidationAccountResult;

    /**
     * Gets the value of the prt022VValidationAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Prt022VValidationAccountExport }
     *     
     */
    public Prt022VValidationAccountExport getPrt022VValidationAccountResult() {
        return prt022VValidationAccountResult;
    }

    /**
     * Sets the value of the prt022VValidationAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prt022VValidationAccountExport }
     *     
     */
    public void setPrt022VValidationAccountResult(Prt022VValidationAccountExport value) {
        this.prt022VValidationAccountResult = value;
    }

}
