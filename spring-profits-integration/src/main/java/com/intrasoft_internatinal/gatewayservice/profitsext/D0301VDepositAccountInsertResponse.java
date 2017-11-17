
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
 *         &lt;element name="D0301V_DepositAccountInsertResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0301VDepositAccountInsertExport" minOccurs="0"/>
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
    "d0301VDepositAccountInsertResult"
})
@XmlRootElement(name = "D0301V_DepositAccountInsertResponse")
public class D0301VDepositAccountInsertResponse {

    @XmlElement(name = "D0301V_DepositAccountInsertResult")
    protected D0301VDepositAccountInsertExport d0301VDepositAccountInsertResult;

    /**
     * Gets the value of the d0301VDepositAccountInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link D0301VDepositAccountInsertExport }
     *     
     */
    public D0301VDepositAccountInsertExport getD0301VDepositAccountInsertResult() {
        return d0301VDepositAccountInsertResult;
    }

    /**
     * Sets the value of the d0301VDepositAccountInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link D0301VDepositAccountInsertExport }
     *     
     */
    public void setD0301VDepositAccountInsertResult(D0301VDepositAccountInsertExport value) {
        this.d0301VDepositAccountInsertResult = value;
    }

}
