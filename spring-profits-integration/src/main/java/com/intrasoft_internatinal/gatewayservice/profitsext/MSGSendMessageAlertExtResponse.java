
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
 *         &lt;element name="MSG_SendMessageAlertExtResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SendMessageAlertExtExport" minOccurs="0"/>
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
    "msgSendMessageAlertExtResult"
})
@XmlRootElement(name = "MSG_SendMessageAlertExtResponse")
public class MSGSendMessageAlertExtResponse {

    @XmlElement(name = "MSG_SendMessageAlertExtResult")
    protected SendMessageAlertExtExport msgSendMessageAlertExtResult;

    /**
     * Gets the value of the msgSendMessageAlertExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendMessageAlertExtExport }
     *     
     */
    public SendMessageAlertExtExport getMSGSendMessageAlertExtResult() {
        return msgSendMessageAlertExtResult;
    }

    /**
     * Sets the value of the msgSendMessageAlertExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageAlertExtExport }
     *     
     */
    public void setMSGSendMessageAlertExtResult(SendMessageAlertExtExport value) {
        this.msgSendMessageAlertExtResult = value;
    }

}
