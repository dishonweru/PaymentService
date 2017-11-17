
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
 *         &lt;element name="Adds01_AdditionalTransactionPostingResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Adds01AdditionalTransactionPostingExport" minOccurs="0"/>
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
    "adds01AdditionalTransactionPostingResult"
})
@XmlRootElement(name = "Adds01_AdditionalTransactionPostingResponse")
public class Adds01AdditionalTransactionPostingResponse {

    @XmlElement(name = "Adds01_AdditionalTransactionPostingResult")
    protected Adds01AdditionalTransactionPostingExport adds01AdditionalTransactionPostingResult;

    /**
     * Gets the value of the adds01AdditionalTransactionPostingResult property.
     * 
     * @return
     *     possible object is
     *     {@link Adds01AdditionalTransactionPostingExport }
     *     
     */
    public Adds01AdditionalTransactionPostingExport getAdds01AdditionalTransactionPostingResult() {
        return adds01AdditionalTransactionPostingResult;
    }

    /**
     * Sets the value of the adds01AdditionalTransactionPostingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adds01AdditionalTransactionPostingExport }
     *     
     */
    public void setAdds01AdditionalTransactionPostingResult(Adds01AdditionalTransactionPostingExport value) {
        this.adds01AdditionalTransactionPostingResult = value;
    }

}
