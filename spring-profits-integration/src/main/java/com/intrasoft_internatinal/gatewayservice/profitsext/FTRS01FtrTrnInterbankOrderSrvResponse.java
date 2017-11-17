
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
 *         &lt;element name="FTRS01_FtrTrnInterbankOrderSrvResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FTRS01_FtrTrnInterbankOrderSrvExport" minOccurs="0"/>
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
    "ftrs01FtrTrnInterbankOrderSrvResult"
})
@XmlRootElement(name = "FTRS01_FtrTrnInterbankOrderSrvResponse")
public class FTRS01FtrTrnInterbankOrderSrvResponse {

    @XmlElement(name = "FTRS01_FtrTrnInterbankOrderSrvResult")
    protected FTRS01FtrTrnInterbankOrderSrvExport ftrs01FtrTrnInterbankOrderSrvResult;

    /**
     * Gets the value of the ftrs01FtrTrnInterbankOrderSrvResult property.
     * 
     * @return
     *     possible object is
     *     {@link FTRS01FtrTrnInterbankOrderSrvExport }
     *     
     */
    public FTRS01FtrTrnInterbankOrderSrvExport getFTRS01FtrTrnInterbankOrderSrvResult() {
        return ftrs01FtrTrnInterbankOrderSrvResult;
    }

    /**
     * Sets the value of the ftrs01FtrTrnInterbankOrderSrvResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTRS01FtrTrnInterbankOrderSrvExport }
     *     
     */
    public void setFTRS01FtrTrnInterbankOrderSrvResult(FTRS01FtrTrnInterbankOrderSrvExport value) {
        this.ftrs01FtrTrnInterbankOrderSrvResult = value;
    }

}
