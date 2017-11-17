
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
 *         &lt;element name="MsgSendBulkMessageAlertExtResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SendBulkMessageAlertExtExport" minOccurs="0"/>
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
    "msgSendBulkMessageAlertExtResult"
})
@XmlRootElement(name = "MsgSendBulkMessageAlertExtResponse")
public class MsgSendBulkMessageAlertExtResponse {

    @XmlElement(name = "MsgSendBulkMessageAlertExtResult")
    protected SendBulkMessageAlertExtExport msgSendBulkMessageAlertExtResult;

    /**
     * Gets the value of the msgSendBulkMessageAlertExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendBulkMessageAlertExtExport }
     *     
     */
    public SendBulkMessageAlertExtExport getMsgSendBulkMessageAlertExtResult() {
        return msgSendBulkMessageAlertExtResult;
    }

    /**
     * Sets the value of the msgSendBulkMessageAlertExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendBulkMessageAlertExtExport }
     *     
     */
    public void setMsgSendBulkMessageAlertExtResult(SendBulkMessageAlertExtExport value) {
        this.msgSendBulkMessageAlertExtResult = value;
    }

}
