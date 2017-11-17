
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
 *         &lt;element name="FEXS01_FundsTransferInHouseResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01_FundsTransferInHouseExport" minOccurs="0"/>
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
    "fexs01FundsTransferInHouseResult"
})
@XmlRootElement(name = "FEXS01_FundsTransferInHouseResponse")
public class FEXS01FundsTransferInHouseResponse {

    @XmlElement(name = "FEXS01_FundsTransferInHouseResult")
    protected FEXS01FundsTransferInHouseExport fexs01FundsTransferInHouseResult;

    /**
     * Gets the value of the fexs01FundsTransferInHouseResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXS01FundsTransferInHouseExport }
     *     
     */
    public FEXS01FundsTransferInHouseExport getFEXS01FundsTransferInHouseResult() {
        return fexs01FundsTransferInHouseResult;
    }

    /**
     * Sets the value of the fexs01FundsTransferInHouseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXS01FundsTransferInHouseExport }
     *     
     */
    public void setFEXS01FundsTransferInHouseResult(FEXS01FundsTransferInHouseExport value) {
        this.fexs01FundsTransferInHouseResult = value;
    }

}
