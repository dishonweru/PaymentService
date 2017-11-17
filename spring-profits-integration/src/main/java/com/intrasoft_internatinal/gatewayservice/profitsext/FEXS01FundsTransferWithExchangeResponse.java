
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
 *         &lt;element name="FEXS01_FundsTransferWithExchangeResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01_FundsTransferWithExchangeExport" minOccurs="0"/>
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
    "fexs01FundsTransferWithExchangeResult"
})
@XmlRootElement(name = "FEXS01_FundsTransferWithExchangeResponse")
public class FEXS01FundsTransferWithExchangeResponse {

    @XmlElement(name = "FEXS01_FundsTransferWithExchangeResult")
    protected FEXS01FundsTransferWithExchangeExport fexs01FundsTransferWithExchangeResult;

    /**
     * Gets the value of the fexs01FundsTransferWithExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXS01FundsTransferWithExchangeExport }
     *     
     */
    public FEXS01FundsTransferWithExchangeExport getFEXS01FundsTransferWithExchangeResult() {
        return fexs01FundsTransferWithExchangeResult;
    }

    /**
     * Sets the value of the fexs01FundsTransferWithExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXS01FundsTransferWithExchangeExport }
     *     
     */
    public void setFEXS01FundsTransferWithExchangeResult(FEXS01FundsTransferWithExchangeExport value) {
        this.fexs01FundsTransferWithExchangeResult = value;
    }

}
